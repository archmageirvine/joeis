package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032426 <code>Sum(a(n)/10^n,n=0..infinity)=exp(1)</code>, from a vertical algorithm for e in base 10.
 * @author Sean A. Irvine
 */
public class A032426 implements Sequence {

  // From Simon Plouffe:
  //
  // Decimal expansion of 1/n! , from n=0.
  // 1.
  // 1.
  // 0.5000000000000000000000000000000...
  // 0.1666666666666666666666666666667...
  // 0.0416666666666666666666666666667...
  // 0.0083333333333333333333333333333...
  // 0.0013888888888888888888888888889...
  // 0.0001984126984126984126984126984...
  // 0.0000248015873015873015873015873...
  // 0.0000027557319223985890652557319...
  // 0.0000002755731922398589065255732...
  // 0.0000000250521083854417187750521...
  // 0.0000000020876756987868098979210...
  // 
  // Now, if you sum vertically each column you get the
  // entries of that sequence.

  private Z mScale = null;

  @Override
  public Z next() {
    mScale = mScale == null ? Z.ONE : mScale.multiply(10);
    Z rf = mScale;
    Z sum = Z.ZERO;
    long k = 0;
    while (!Z.ZERO.equals(rf)) {
      sum = sum.add(rf.mod(10));
      rf = rf.divide(++k);
    }
    return sum;
  }
}
