package irvine.oeis.a126;
// manually A064437/parmof4 at 2022-12-29 14:08

import irvine.math.z.Z;
import irvine.oeis.a064.A064437;

/**
 * A126091 a(1)=1;a(2)=4; for n&gt;2, a(n)=a(n-2)+3 if n is already in the sequence, a(n)=a(n-2)+1 otherwise.
 * @author Georg Fischer
 */
public class A126091 extends A064437 {

  /** Construct the sequence. */
  public A126091() {
    super(1, 1, +3, +1);
  }

  @Override
  public Z next() {
    ++mN;
    Z result = null;
    if (mN == mOffset) {
      result = mInit;
    } else if (mN == mOffset + 1) {
      result = Z.FOUR;
    } else {
      result = mSet.contains(Z.valueOf(mN)) ? mPrev2.add(mAdd1) : mPrev2.add(mAdd2);
    }
    mPrev2 = mPrev;
    mPrev = result;
    mSet.add(result);
    return result;
  }
}
