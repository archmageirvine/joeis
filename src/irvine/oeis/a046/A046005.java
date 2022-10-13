package irvine.oeis.a046;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a003.A003636;

/**
 * A046005 Discriminants of imaginary quadratic fields with class number 8 (negated).
 * @author Sean A. Irvine
 */
public class A046005 implements SequenceWithOffset {

  private long mN;
  private int mClassNo;
  private int mOffset;

  /** Construct the sequence. */
  public A046005() {
    this(1, 8);
  }

  /**
   * Generic constructor with base and no prepended terms
   * @param offset first index
   * @param classNo desired class number
   */
  public A046005(final int offset, final int classNo) {
    mOffset = offset;
    mClassNo = classNo;
    mN = -2;
  }

  protected int targetClassNumber() {
    return mClassNo;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      mN -= 1;
      if ((mN & 3) <= 1) {
        final List<A003636.ReducedPositiveDefiniteForm> forms = A003636.forms(mN);
        if (forms.size() == targetClassNumber()) {
          final long classNumber = A003636.classNumber(forms);
          if (classNumber == forms.size()) {
            return Z.valueOf(-mN);
          }
        }
      }
    }
  }
}
