package irvine.oeis.a080;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080576 Triangle in which n-th row lists all partitions of n, in graded reflected lexicographic order.
 * @author Sean A. Irvine
 */
public class A080576 extends Sequence1 {

  private int mN = 0;
  private int mL = 0;
  private int mM = 0;
  private List<int[]> mPart = new ArrayList<>();

  @Override
  public Z next() {
    if (--mM < 0) {
      if (--mL < 0) {
        mPart.clear();
        final IntegerPartition pg = new IntegerPartition(++mN);
        int[] p;
        while ((p = pg.next()) != null) {
          mPart.add(p);
        }
        mL = mPart.size() - 1;
      }
      mM = mPart.get(mL).length - 1;
    }
    return Z.valueOf(mPart.get(mL)[mM]);
  }
}
