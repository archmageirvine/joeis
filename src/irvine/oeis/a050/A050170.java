package irvine.oeis.a050;
// manually parm3 at 2021-08-06

import irvine.math.z.Z;

/**
 * A050170 a(1) = 1, a(n) = floor(a(n-1)/sqrt(5)) if this is not among 0,a(1),...,a(n-1); otherwise a(n) = floor(a(n-1)*sqrt(5)).
 * @author Georg Fischer
 */
public class A050170 extends A050132 {

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mPrev = Z.ONE;
      mA.add(mPrev);
      return mPrev;
    }
    Z result = mPrev.multiply(mPrev).divide(5).sqrtAndRemainder()[0];
    if (mA.contains(result) || result.equals(mPrev)) {
      result = mPrev.multiply(mPrev).multiply(5).sqrtAndRemainder()[0];
    }
    mA.add(result);
    mPrev = result;
    return result;
  }
}

