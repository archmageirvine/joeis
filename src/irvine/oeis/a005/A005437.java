package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005437 Column of Kempner tableau.
 * @author Sean A. Irvine
 */
public class A005437 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005437(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005437() {
    super(0);
  }

  protected Z[] mPrev = new Z[0];

  @Override
  public Z next() {
    final Z[] t = new Z[mPrev.length + 1];
    if ((t.length & 1) == 1) {
      // m recurrence
      if (t.length == 1) {
        t[0] = Z.ONE;
      } else {
        t[0] = Z.ZERO;
        for (int k = 1; k < t.length; ++k) {
          t[k] = t[k - 1].add(mPrev[k - 1]);
        }
      }
    } else {
      t[t.length - 1] = Z.ZERO;
      for (int k = t.length - 2; k >= 0; --k) {
        t[k] = t[k + 1].add(mPrev[k]);
      }
    }
    mPrev = t;
    //System.out.println(Arrays.toString(mPrev));
    return mPrev[(mPrev.length - 1) / 2];
  }
}

