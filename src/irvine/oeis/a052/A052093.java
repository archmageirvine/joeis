package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A052093 a(n)^4 is the smallest fourth power whose decimal expansion digits occur with same frequency n.
 * @author Sean A. Irvine
 */
public class A052093 implements Sequence {

  private int mN = 0;
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      mM = mM.add(1);
      final int[] cnts = ZUtils.digitCounts(mM.pow(4));
      final int c = A052046.isNonzeroConstant(cnts);
      if (mFirsts.get(c) == null) {
        mFirsts.set(c, mM);
      }
    }
    return mFirsts.get(mN);
  }
}

