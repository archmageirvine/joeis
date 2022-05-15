package irvine.factor.factor;

import java.math.BigInteger;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import de.tilman_neumann.jml.factor.CombinedFactorAlgorithm;
import de.tilman_neumann.util.SortedMultiset;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Attempt to factor by using Tillman's Java Math Library.
 * @author Sean A. Irvine
 */
public class TillmanFactorizer extends AbstractFactorizer {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private final CombinedFactorAlgorithm mCfa = new CombinedFactorAlgorithm(THREADS, null, true);

  {
    // todo how to turn off just for JMA?
    Logger.getRootLogger().setLevel(Level.OFF);
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    message("Trying: " + n);
    final int exponent = fs.getExponent(n);
    fs.remove(n);
    // Remove any negative first
    if (n.signum() < 0) {
      n = n.negate();
      if ((exponent & 1) == 1) {
        fs.add(-1L);
      }
    }
    final SortedMultiset<BigInteger> factors = mCfa.factor(n.bigIntegerValue());
    for (final BigInteger p : factors.toList()) {
      fs.add(Z.valueOf(p), FactorSequence.PRIME, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new TillmanFactorizer(), args);
  }
}
