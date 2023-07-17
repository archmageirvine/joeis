package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A037203 Number of terms by which A001223 lags behind A037201.
 * @author Sean A. Irvine
 */
public class A037203 extends A001223 {

  /** Construct the sequence. */
  public A037203() {
    super(0);
  }

  private Z mPrev = Z.ZERO;
  private long mLag = 0;

  @Override
  public Z next() {
    final Z t = mPrev;
    mPrev = super.next();
    if (t.equals(mPrev)) {
      ++mLag;
    }
    return Z.valueOf(mLag);
  }
}
