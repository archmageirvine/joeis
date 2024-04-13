package irvine.oeis.a026;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partition.DistinctPartsPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026793 Juxtaposed partitions of 1,2,3,... into distinct parts, ordered by number of terms and then lexicographically.
 * @author Sean A. Irvine
 */
public class A026793 extends Sequence1 {

  private int mN = 0;
  private int mL = 0;
  private int mM = 0;
  private final List<int[]> mPart = new ArrayList<>();

  @Override
  public Z next() {
    if (--mM < 0) {
      if (--mL < 0) {
        mPart.clear();
        final DistinctPartsPartition pg = new DistinctPartsPartition(++mN);
        int[] p;
        while ((p = pg.next()) != null) {
          mPart.add(p);
        }
        mPart.sort((a, b) -> {
          // Sort by number of parts, then lexicographically
          final int c = Integer.compare(b.length, a.length);
          if (c != 0) {
            return c;
          }
          int ak = 0;
          int bk = 0;
          while (a[ak] == b[bk]) {
            ++ak;
            ++bk;
          }
          return Integer.compare(a[ak], b[bk]);
        });
        mL = mPart.size() - 1;
      }
      mM = mPart.get(mL).length - 1;
    }
    final int[] res = mPart.get(mL);
    return Z.valueOf(res[mM]);
  }
}
