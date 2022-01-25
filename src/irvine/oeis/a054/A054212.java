package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A054212 a(n)^5 is the smallest fifth power whose decimal expansion digits occur with same frequency n.
 * @author Sean A. Irvine
 */
public class A054212 implements Sequence {

  private int mN = 0;
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private Z mM = Z.NEG_ONE;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      mM = mM.add(1);
      final int[] cnts = ZUtils.digitCounts(mM.pow(5));
      final int c = IntegerUtils.isNonzeroConstant(cnts);
      if (mFirsts.get(c) == null) {
        mFirsts.set(c, mM);
      }
    }
    return mFirsts.get(mN);
  }
}

