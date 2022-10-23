package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A052069 a(n)^2 is the smallest square whose digits occur with the same frequency n.
 * @author Sean A. Irvine
 */
public class A052069 extends Sequence1 {

  private int mN = 0;
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      mM = mM.add(1);
      final int[] cnts = ZUtils.digitCounts(mM.square());
      final int c = IntegerUtils.isNonzeroConstant(cnts);
      if (mFirsts.get(c) == null) {
        mFirsts.set(c, mM);
      }
    }
    return mFirsts.get(mN);
  }
}

