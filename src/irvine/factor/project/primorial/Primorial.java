package irvine.factor.project.primorial;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.math.z.Z;

import irvine.factor.prime.Fast;
import irvine.math.z.ZUtils;
import irvine.factor.util.FactorSequence;

/**
 * Generate factorizations of the primorial numbers. Backed by
 * <code>factordb.com</code>.
 *
 * @author Sean A. Irvine
 */
public final class Primorial {

  private Primorial() { }

  private final Factorizer mFactorizer = new CachedFactorizer(new FactorDbFactorizer());

  private String toString(final FactorSequence fs) {
    final StringBuilder sb = new StringBuilder();
    for (final Z n : fs.toZArray()) {
      if (sb.length() > 0) {
        sb.append('.');
      }
      final int status = fs.getStatus(n);
      final boolean p = status == FactorSequence.PRIME || status == FactorSequence.PROB_PRIME;
      if (!p) {
        sb.append('(');
      }
      sb.append(n);
      final int exp = fs.getExponent(n);
      if (exp > 1) {
        sb.append('^').append(exp);
      }
      if (!p) {
        sb.append(')');
      }
    }
    return sb.toString();
  }

  private String primorial(final Z n) {
    final FactorSequence fs = new FactorSequence(n);
    mFactorizer.factor(fs);
    return toString(fs);
  }

  /**
   * Main program.
   * @param args numbers to generate sequence for
   */
  public static void main(final String[] args) {
    final Primorial s = new Primorial();
    final Fast prime = new Fast();
    for (long k = 2; k < 500; k = prime.nextPrime(k)) {
      final Z n = ZUtils.primorial(k);
      System.out.println(k + "#-1 " + s.primorial(n.subtract(1)));
      System.out.println(k + "#+1 " + s.primorial(n.add(1)));
    }
  }

}

