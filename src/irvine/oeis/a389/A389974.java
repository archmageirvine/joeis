package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389974 A generalization of Euclid-Mullin sequence A000945 applied to generate only primes of the form 4k+3: let Q be the product of all preceding terms, then a(n) is the smallest prime factor of the form 4k+3 of whichever of {Q+2, Q+4} has the form 4k+3.
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
