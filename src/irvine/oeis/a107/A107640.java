package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicByteArray;

/**
 * A107640 Order of appearance of twos in the tribonacci ( Rauzy type) substitution: triangular.
 * @author Sean A. Irvine
 */
public class A107640 extends Sequence1 {

  private final byte mTarget;
  private DynamicByteArray mRow = new DynamicByteArray();
  private int mM = -1;
  private int mN = 0;
  {
    mRow.set(0, (byte) 2);
  }

  protected A107640(final byte target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A107640() {
    this((byte) 2);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        final DynamicByteArray newRow = new DynamicByteArray();
        for (int k = 0, j = 0; k < mRow.length() && j <= mN; ++k) {
          switch (mRow.get(k)) {
            case 1:
              newRow.set(j++, (byte) 2);
              break;
            case 2:
              newRow.set(j++, (byte) 3);
              break;
            case 3:
              newRow.set(j++, (byte) 1);
              newRow.set(j++, (byte) 2);
              newRow.set(j++, (byte) 3);
              break;
            default:
              throw new RuntimeException();
          }
        }
        mRow = newRow;
        mM = 0;
      }
      if (mRow.get(mM) == mTarget) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
