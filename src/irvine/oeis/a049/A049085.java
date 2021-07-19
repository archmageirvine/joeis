package irvine.oeis.a049;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049085 Irregular table T(n,k) = maximal part of the k-th partition of n, when listed in Abramowitz-Stegun order (as in A036043).
 * @author Sean A. Irvine
 */
public class A049085 implements Sequence {

  private int mN = 0;
  private int mM = -1;
  private List<int[]> mA = new ArrayList<>();
  {
    mA.add(new int[] {0});
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      final IntegerPartition part = new IntegerPartition(++mN);
      int[] p;
      while ((p = part.next()) != null) {
        mA.add(p);
      }
      mA.sort(IntegerPartition.ABRAHAM_STEGUN_SORT);
      mM = 0;
    }
    return Z.valueOf(mA.get(mM)[0]);
  }
}
