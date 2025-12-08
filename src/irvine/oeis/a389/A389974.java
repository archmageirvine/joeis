package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389974 allocated for Peter Munn.
 * @author Sean A. Irvine
 */
public class A389974 extends Sequence1 {

  private Z mProd = Z.THREE;
  private Z mA = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      Z q = mProd.add(2 * (2 - (mN & 1)));
      while (true) {
        final Z lpf = Functions.LPF.z(q);
        if (lpf.mod(4) == 3) {
          mA = lpf;
          mProd = mProd.multiply(mA);
          break;
        }
        q = q.divide(lpf);
      }
    }
    return mA;
  }
}

// a(n) = min({p prime : p|Q and p has form 3k+4}), where Q = (Product_{k=1..(n-1)} a(k)) + 2*(2 - (n mod 2)).
