package irvine.oeis.a079;
// manually A064437/parmof4 at 2022-12-29 14:08

import irvine.math.z.Z;
import irvine.oeis.a064.A064437;

/**
 * A079352 a(1)=1, then a(n)=3*a(n-1) if n is already in the sequence, a(n)=2*a(n-1) otherwise.
 * @author Georg Fischer
 */
public class A079352 extends A064437 {

  /** Construct the sequence. */
  public A079352() {
    super(1, 1, 3, 2);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = (mN == mOffset) ? mInit : (mSet.contains(Z.valueOf(mN)) ? mPrev.multiply(mAdd1) : mPrev.multiply(mAdd2));
    mPrev2 = mPrev;
    mPrev = result;
    mSet.add(result);
    return result;
  }
}
