package irvine.factor.prover;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.CliFlags;

/**
 * Apply the Lucas primality test. Let <code>n</code> be a positive integer.
 * If there exists an integer <code>a, 1 &lt; a &lt; n</code>, such that
 * <code>a^(n-1) = 1 (mod n)</code> and for every prime <code>q</code> of
 * <code>n-1</code>, <code>a^((n-1)/q) != 1 (mod n)</code> then <code>n</code>
 * is prime. If no such number <code>a</code> exists, then <code>n</code> is
 * either 1 or composite.
 * @author Sean A. Irvine
 */
public class LucasProver extends AbstractProver {

  private static final long DEFAULT_TRIAL_DIVISION_LIMIT = 1000000;
  private static final long DEFAULT_ATTEMPTS = 1000;

  private static final String HELPERS_FLAG = "helpers";
  private static final String TRIAL_DIVISION_LIMIT_FLAG = "trial-division-limit";
  private static final String WITNESS_FLAG = "witness";
  private static final String VERBOSE_FLAG = "verbose";
  private static final String SYSTEMATIC_FLAG = "systematic";
  private static final String ATTEMPTS_FLAG = "attempts";

  private final Set<Z> mHelperFactors = new HashSet<>();
  private long mSearchLimit = DEFAULT_TRIAL_DIVISION_LIMIT;
  private long mAttempts = DEFAULT_ATTEMPTS;
  private Z mWitness = null;
  private boolean mSystematic = false;

  /**
   * Add a specific prime helper factor.  All such factors are assumed to be
   * prime and it is the caller's responsibility to ensure that this is the
   * case.
   * @param n helper factor
   */
  public void addHelper(final Z n) {
    mHelperFactors.add(n);
  }

  /**
   * Add helper factors read from a stream, one per line. Empty lines and lines
   * starting with <code>#</code> are ignored.
   * @param r source
   * @throws IOException if an I/O error occurs
   */
  public void addHelpers(final BufferedReader r) throws IOException {
    mHelperFactors.addAll(ZUtils.read(r));
  }

  /**
   * Add helper factors read from a file, one per line. Empty lines and lines
   * starting with <code>#</code> are ignored.
   * @param file file to read
   * @throws IOException if an I/O error occurs
   */
  public void addHelpers(final File file) throws IOException {
    try (final BufferedReader r = new BufferedReader(new FileReader(file))) {
      addHelpers(r);
    }
  }

  /**
   * Set the limit used for trial division.
   * @param searchLimit trial division limit
   */
  public void setSearchLimit(final long searchLimit) {
    mSearchLimit = searchLimit;
  }

  /**
   * Set the limit for the number of attempts when doing a random search for a witness.
   * @param attempts number of attempts
   */
  public void setAttempts(final long attempts) {
    mAttempts = attempts;
  }

  /**
   * Set an explicit witness to be used (e.g. from a previously discovered
   * proof), as opposed to trying to discover a witness.
   * @param witness witness value
   */
  public void setWitness(final Z witness) {
    mWitness = witness;
  }

  /**
   * Set whether the search for a witness should be systematic.
   * @param systematic true for a systematic rather than random search
   */
  public void setSystematic(final boolean systematic) {
    mSystematic = systematic;
  }

  private Set<Z> factor(final Z n) {
    Z m = n;
    final Set<Z> factors = new HashSet<>();
    // First deal with any helper factors the user supplied.  Since the helper
    // may apply to multiple inputs, verify the factor (but not its primality).
    for (final Z p : mHelperFactors) {
      while (m.mod(p).isZero()) {
        factors.add(p);
        m = m.divide(p);
      }
      if (Z.ONE.equals(m)) {
        return factors;
      }
    }
    // If factorization was not complete, search up to the trial division limit
    final PrimeDivision factorizer = new PrimeDivision(mSearchLimit);
    factorizer.setVerbose(isVerbose());
    final FactorSequence fs = factorizer.factorize(m);
    if (!fs.isComplete()) {
      return null;
    }
    Collections.addAll(factors, fs.toZArray());
    return factors;
  }

  private PrimeStatus isPrime(final Z n, final Set<Z> factors, final Z witness) {
    message("Trying witness " + witness);
    final Z m = n.subtract(1);
    if (!Z.ONE.equals(witness.modPow(m, n))) {
      return PrimeStatus.COMPOSITE;
    }
    message("Witness " + witness + " passed test on n-1");
    for (final Z p : factors) {
      final Z[] t = m.divideAndRemainder(p);
      if (!t[1].isZero()) {
        throw new RuntimeException();
      }
      if (Z.ONE.equals(witness.modPow(t[0], n))) {
        message("Witness " + witness + " failed for " + p);
        return PrimeStatus.UNKNOWN; // witness does not work for n
      }
      message("Witness " + witness + " passed for " + p);
    }
    return PrimeStatus.PRIME;
  }

  @Override
  public PrimeStatus isPrime(final Z n) {
    message("Starting LucasProver");
    if (Z.ONE.compareTo(n) >= 0) {
      return PrimeStatus.COMPOSITE;
    }
    if (Z.TWO.equals(n)) {
      return PrimeStatus.PRIME;
    }
    assert n.compareTo(Z.TWO) > 0;
    if (n.isEven()) {
      // The Lucas test does work properly for even numbers, but let's not waste time doing it
      return PrimeStatus.COMPOSITE;
    }
    // We need the complete factorization of n - 1
    final Z m = n.subtract(1);
    message("Attempting to factor " + m);
    final Set<Z> factors = factor(m);
    if (factors == null) {
      // We failed to completely factor n-1, the Lucas test cannot be applied
      message("Factorization failed, cannot apply Lucas test");
      return PrimeStatus.UNKNOWN;
    }
    message("Found factors: " + factors);
    // See if we were already told the witness, and do verification
    if (mWitness != null) {
      return isPrime(n, factors, mWitness);
    }
    // Choose a base in [2, n-1]
    if (mSystematic) {
      // Try potential witnesses in order
      for (Z w = Z.TWO; w.compareTo(n) < 0; w = w.add(1)) {
        if (isPrime(n, factors, w) == PrimeStatus.PRIME) {
          message("Success with witness " + w);
          return PrimeStatus.PRIME;
        }
      }
      return PrimeStatus.COMPOSITE; // We exhausted very possible witness
    } else {
      // Try potential witnesses at random
      final Z lim = n.subtract(2);
      for (long k = 0; k < mAttempts; ++k) {
        final Z w = Z.TWO.add(ZUtils.random(lim));
        if (isPrime(n, factors, w) == PrimeStatus.PRIME) {
          message("Success with witness " + w);
          return PrimeStatus.PRIME;
        }
      }
      return PrimeStatus.UNKNOWN; // Could still be prime, just a witness we didn't try
    }
  }

  /**
   * Attempt to prove primality.
   * @param args numbers to prove
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("LucasProver", "Apply the Lucas primality test");
    flags.registerOptional('v', VERBOSE_FLAG, "Turn on extra reporting");
    flags.registerOptional('H', HELPERS_FLAG, File.class, "FILE", "File containing helper factors");
    flags.registerOptional('t', TRIAL_DIVISION_LIMIT_FLAG, Long.class, "LONG", "Limit for trial division", DEFAULT_TRIAL_DIVISION_LIMIT);
    flags.registerOptional('w', WITNESS_FLAG, String.class, "Z", "Verify using given witness");
    flags.registerOptional('s', SYSTEMATIC_FLAG, "If set, then check potential witnesses sequentially rather than at random");
    flags.registerOptional('a', ATTEMPTS_FLAG, Long.class, "long", "Number of witnesses to attempt when making random search", DEFAULT_ATTEMPTS);
    flags.registerRequired(String.class, "n", "Expression or number to be tested");
    flags.setFlags(args);
    final LucasProver prover = new LucasProver();
    prover.setVerbose(flags.isSet(VERBOSE_FLAG));
    prover.setSystematic(flags.isSet(SYSTEMATIC_FLAG));
    prover.setSearchLimit((long) flags.getValue(TRIAL_DIVISION_LIMIT_FLAG));
    prover.setAttempts((long) flags.getValue(ATTEMPTS_FLAG));
    if (flags.isSet(WITNESS_FLAG)) {
      prover.setWitness(new Z(flags.getValue(WITNESS_FLAG).toString()));
    }
    if (flags.isSet(HELPERS_FLAG)) {
      prover.addHelpers((File) flags.getValue(HELPERS_FLAG));
    }
    final Z n = ((LiteralZ) Sircon.parse(flags.getAnonymousValue(0).toString()).eval()).value();
    System.out.println(prover.isPrime(n));
  }
}
