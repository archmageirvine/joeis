package irvine.oeis.a026;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026793 Juxtaposed partitions of 1,2,3,... into distinct parts, ordered by number of terms and then lexicographically.
 * @author Sean A. Irvine
 */
public class A026793 implements Sequence {

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
          if (IntegerPartition.isDistinctParts(p)) {
            mPart.add(p);
          }
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
