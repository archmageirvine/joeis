package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046759 Economical numbers: write n as a product of primes raised to powers, let D(n) = number of digits in product, l(n) = number of digits in n; sequence gives n such that D(n) &lt; l(n).
 * @author Sean A. Irvine
 */
public class A046759 implements Sequence {

  private long mN = 124;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final int len = String.valueOf(mN).length();
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
      if (l < len) {
        return Z.valueOf(mN);
      }
    }
  }
}
