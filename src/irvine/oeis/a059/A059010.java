package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059010 Natural numbers having an even number of nonleading zeros in their binary expansion.
 * @author Sean A. Irvine
 */
public class A059010 extends AbstractSequence {

  /* Construct the sequence. */
  public A059010() {
    super(0);
  }

  private long mN = 0;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        ++mM;
      }
      if (((mM - Long.bitCount(mN)) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

