package irvine.oeis.a050;
// manually parm3 at 2021-08-06

import irvine.math.z.Z;

/**
 * A050128 a(n) = floor(a(n-1)/2) if this is not among 0, a(1), ..., a(n-1); otherwise a(n) = 2*n.
 * @author Georg Fischer
 */
public class A050128 extends A050000 {

  /** Construct the sequence. */
  public A050128() {
    super(2, 2);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    Z result = mPrev.divide(mParm2);
    if (mA.contains(result)) {
      result = Z.valueOf(2 * mN);
    }
    mA.add(result);
    mPrev = result;
    return result;
  }
}
