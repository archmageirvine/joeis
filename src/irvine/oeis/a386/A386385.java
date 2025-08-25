package irvine.oeis.a386;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a157.A157196;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A386385 extends Sequence0 {

  //{3, 4, 11, 12, 15, 16, 19, 20, 27, 28}
  private static final long RETAIN = 0b11000000110011001100000011000;
  private final Sequence mS = new A157196();
  private int mMod32 = -1;
  private final LinkedList<Long> mList = new LinkedList<>();

  private long getBlock() {
    final Z t = mS.next();
    if (Z.TWO.equals(t)) {
      return 2;
    }
    assert t.isOne();
    final Z u = mS.next();
    assert u.isOne();
    return 11;
  }

  private void updateOutputList(final long v) {
    if (v == 2) {
      mList.add(2L);
    } else {
      assert v == 11;
      mList.add(1L);
      mList.add(1L);
    }
  }

  @Override
  public Z next() {
    if (mList.isEmpty()) {
      if (++mMod32 == 32) {
        mMod32 = 0;
      }
      final long a = getBlock();
      if ((RETAIN & (1L << mMod32)) != 0) {
        // Retain the block as is
        updateOutputList(a);
      } else {
        // Swap
        updateOutputList(a == 2 ? 11 : 2);
      }
    }
    return Z.valueOf(mList.pollFirst());
  }
}

