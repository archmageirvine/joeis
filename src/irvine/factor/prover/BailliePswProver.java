package irvine.factor.prover;

import java.io.IOException;

import irvine.math.expression.LiteralZ;
import irvine.math.expression.Sircon;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.CliFlags;

/**
 * A prover for <code>n &lt; 2<sup>64</sup></code>.
 * @author Sean A. Irvine
 */
public class BailliePswProver extends AbstractProver {

  private static final String VERBOSE_FLAG = "verbose";

  @Override
  public PrimeStatus isPrime(final Z n) {
    message("Starting BailliePswProver");
    if (Z.ONE.compareTo(n) >= 0) {
      return PrimeStatus.COMPOSITE;
    }
    if (Z.TWO.equals(n)) {
      return PrimeStatus.PRIME;
    }
    assert n.compareTo(Z.TWO) > 0;
    if (n.isEven()) {
      return PrimeStatus.COMPOSITE;
    }
    // Although Baillie-PSW can only currently prove primality for n < 2^64, it can
    // determine that a number is composite.

    // Base 2 strong probable prime test
    if (!ZUtils.sprpTest(2L, n)) {
      message("Number is composite by base 2 strong probable prime test");
      return PrimeStatus.COMPOSITE;
    }
    final PrimeStatus s = new LucasProbablePrime(n).runTest();
    if (s == PrimeStatus.COMPOSITE) {
      message("Number is composite by string Lucas probable prime test");
      return s;
    }
    if (n.bitLength() < 64) {
      assert s == PrimeStatus.PROB_PRIME;
      message("Number is prime by Baillie-PSW test");
      return PrimeStatus.PRIME;
    }
    message("Cannot give definitive answer");
    return s;
  }

  /**
   * Attempt to prove primality.
   * @param args numbers to prove
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("BailliePsw", "Apply the Baillie-PSW primality test");
    flags.registerOptional('v', VERBOSE_FLAG, "Turn on extra reporting");
    flags.registerRequired(String.class, "n", "Expression or number to be tested");
    flags.setFlags(args);
    final BailliePswProver prover = new BailliePswProver();
    prover.setVerbose(flags.isSet(VERBOSE_FLAG));
    final Z n = ((LiteralZ) Sircon.parse(flags.getAnonymousValue(0).toString()).eval()).value();
    System.out.println(prover.isPrime(n));
  }
}
