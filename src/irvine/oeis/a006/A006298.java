package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006298 Number of genus 2 rooted maps with 1 face with n vertices.
 * @author Sean A. Irvine
 */
public class A006298 extends AbstractSequence {

  /** Construct the sequence. */
  public A006298() {
    super(4);
  }

  private Z mPrev = null;
  private long mN = 3;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.valueOf(21);
    } else {
      ++mN;
      mPrev = mPrev.multiply(4 * mN + 2).multiply(5 * mN + 3)
        .divide(5 * mN - 2).divide(mN - 3);
    }
    return mPrev;
  }
}
