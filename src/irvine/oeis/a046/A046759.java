package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046759 Economical numbers: write n as a product of primes raised to powers, let D(n) = number of digits in product, l(n) = number of digits in n; sequence gives n such that D(n) &lt; l(n).
 * @author Sean A. Irvine
 */
public class A046759 extends Sequence1 {

  private long mN = 124;

  /**
   * Test if a number if economical.
   * @param n number to test
   * @return true if the number is economical
   */
  public static boolean isEconomical(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final int len = String.valueOf(n).length();
    int l = 0;
    for (final Z p : fs.toZArray()) {
      l += p.toString().length();
      final int e = fs.getExponent(p);
      if (e > 1) {
        l += String.valueOf(e).length();
      }
      if (l >= len) {
        break;
      }
    }
    return l < len;
  }

  @Override
  public Z next() {
    while (!isEconomical(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }

}
