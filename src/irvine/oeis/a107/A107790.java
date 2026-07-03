package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicByteArray;

/**
 * A107790 Positions of 1's in the 2-limiting word of the morphism 1-&gt;2, 2-&gt;3, 3-&gt;123.
 * @author Sean A. Irvine
 */
public class A107790 extends Sequence1 {

  private final byte mTarget;
  private DynamicByteArray mRow = new DynamicByteArray();
  private int mM = -1;

  protected A107790(final byte target, final byte start) {
    mTarget = target;
    mRow.set(0, start);
  }

  /** Construct the sequence. */
  public A107790() {
    this((byte) 1, (byte) 2);
  }

  private void step() {
    final DynamicByteArray newRow = new DynamicByteArray();
    for (int k = 0, j = 0; k < mRow.length(); ++k) {
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
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      if (mM >= mRow.length()) {
        step();
        step();
        step();
      }
      if (mRow.get(mM) == mTarget) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
