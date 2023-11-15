package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066861 For x &gt; 0 let f(x) = x/2 if x is even, f(x) = (3*x+1)/2 if x is odd (3x+1 or Collatz problem). Sequence gives numbers such that k-1 applications of f lead to k for some k &gt; 0.
 * @author Sean A. Irvine
 */
public class A066861 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z x = mN;
      long k = 1;
      while (true) {
        if (x.bitLength() < Long.SIZE && x.longValue() == k) {
          return mN;
        }
        if (Z.ONE.equals(x)) {
          break;
        }
        x = x.isEven() ? x.divide2() : x.multiply(3).add(1).divide2();
        ++k;
      }
    }
  }
}
