package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064353 Kolakoski-(1,3) sequence: the alphabet is {1,3}, and a(n) is the length of the n-th run.
 * @author Georg Fischer
 */
public class A064353 extends AbstractSequence implements DirectSequence {

  private final LongDynamicBooleanArray mA;
  private long mL; // Length of computed region of mA
  private long mN;
  private long mM; // Position of last run length expanded in mA
  private boolean mNext;
  private final int mParm1; // Kolakoski-(mParm1, mParm2)
  private final int mParm2; // Kolakoski-(mParm1, mParm2)

  /** Construct the sequence. */
  public A064353() {
    this(1, 1, 3, 1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm1 Kolakoski-(parm1, parm2)
   * @param parm2 Kolakoski-(parm1, parm2)
   * @param lo lower limit for initial set
   * @param hi upper limit for initial set
   */
  public A064353(final int offset, final int parm1, final int parm2, final int lo, final int hi) {
    super(offset);
    mN = 0;
    mParm1 = (parm1 < parm2) ? parm1 : parm2;
    mParm2 = (parm1 < parm2) ? parm2 : parm1;
    mL = hi + 1;
    mM = (parm1 > parm2 || lo > hi) ? 0 : 1;
    mNext = lo < hi;
    mA = new LongDynamicBooleanArray();
    for (int ia = lo; ia <= hi; ++ia) {
      mA.set(ia);
    }
    // System.out.println("mN=" + mN + ", mL=" + mL + ", mM=" + mM + ", mNext=" + mNext + ", mParm1=" + mParm1 + ", mParm2=" + mParm2);
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    while (n >= mL) {
      mNext = !mNext;
      if (mA.isSet(++mM)) {
        if (mNext) {
          for (int ia = 1; ia <= mParm2; ++ia) {
            mA.set(mL++);
          }
        } else {
          mL += mParm2;
        }
      } else if (mNext) {
        for (int ia = 1; ia <= mParm1; ++ia) {
          mA.set(mL++);
        }
      } else {
        mL += mParm1;
      }
    }
    return mA.isSet(n - 1) ? Z.valueOf(mParm2) : Z.valueOf(mParm1);
  }

}
