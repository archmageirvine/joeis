package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A052071 a(n)^3 is the smallest cube whose digits occur with the same frequency n.
 * @author Sean A. Irvine
 */
public class A052071 implements Sequence {

  private int mN = 0;
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      mM = mM.add(1);
      final int[] cnts = ZUtils.digitCounts(mM.pow(3));
      final int c = IntegerUtils.isNonzeroConstant(cnts);
      if (mFirsts.get(c) == null) {
        mFirsts.set(c, mM);
      }
    }
    return mFirsts.get(mN);
  }
}

