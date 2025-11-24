package irvine.oeis.a082;

import java.util.ArrayList;
import java.util.List;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082009 a(n) is the label of parent node of node n in tree shown in A082007.
 * @author Sean A. Irvine
 */
public class A082009 extends Sequence1 {

  private int mN = -1;
  private final List<long[]> mW = new ArrayList<>();
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private int mM = 1;

  private void step() {
    if (mW.isEmpty()) {
      mW.add(new long[] {0L});
    }
    ++mM;
    final long k = Long.highestOneBit(mM - 1);
    final int baseIndex = (int) (mM - k - 1);
    final long[] base = mW.get(baseIndex);
    final int copies = 1 << (int) k;
    final long shiftFactor = (1L << (int) k) - 1L;
    final List<Long> newWList = new ArrayList<>();
    for (int j = 1; j <= copies; ++j) {
      final long shift = shiftFactor * j;
      for (final long x : base) {
        newWList.add(x + shift);
      }
    }
    final long[] newW = LongUtils.toLong(newWList);
    mW.add(newW);
    // Riffle
    final long[] wLast = mW.get(mW.size() - 1);
    final long[] wPrevLast = mW.get(mW.size() - 2);
    final long[] riffle = new long[wPrevLast.length * 2];
    int pos = 0;
    for (final long x : wPrevLast) {
      riffle[pos++] = x;
      riffle[pos++] = x;
    }
    for (int j = 0; j < wLast.length && j < riffle.length; ++j) {
      mA.set(wLast[j] - 1, riffle[j]);
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mN >= 2 && mA.get(mN) == 0) {
      step();
    }
    return Z.valueOf(mA.get(mN));
  }
}
