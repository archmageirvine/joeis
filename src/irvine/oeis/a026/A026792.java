package irvine.oeis.a026;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026792 List of juxtaposed reverse-lexicographically ordered partitions of the positive integers.
 * @author Sean A. Irvine
 */
public class A026792 extends Sequence1 {

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
        mPart.sort((a, b) -> {
          int ak = a.length - 1;
          int bk = b.length - 1;
          while (a[ak] == b[bk]) {
            --ak;
            --bk;
          }
          return Integer.compare(a[ak], b[bk]);
        });
        mL = mPart.size() - 1;
      }
      mM = mPart.get(mL).length - 1;
    }
    final int[] res = mPart.get(mL);
    return Z.valueOf(res[res.length - 1 - mM]);
  }
}
