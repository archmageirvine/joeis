package irvine.oeis.a111;
// manually A064437/parmof4 at 2022-12-29 13:55

import irvine.math.z.Z;
import irvine.oeis.a064.A064437;

/**
 * A111202 a(1)=2 then a(n)=a(n-1)+3 if n is already in the sequence, a(n)=a(n-2)+1 otherwise.
 * @author Georg Fischer
 */
public class A111202 extends A064437 {

  private Z mPrev2; // a(n-2)

  /** Construct the sequence. */
  public A111202() {
    super(1, 2, +3, +1);
    mPrev2 = Z.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = (mN == mOffset) ? mInit : (mSet.contains(Z.valueOf(mN)) ? mPrev.add(mAdd1) : mPrev2.add(mAdd2));
    mPrev2 = mPrev;
    mPrev = result;
    mSet.add(result);
    return result;
  }
}
