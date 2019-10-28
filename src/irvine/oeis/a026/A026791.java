package irvine.oeis.a026;

import java.util.ArrayList;
import java.util.List;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026791 Triangle in which n-th row lists juxtaposed lexicographically ordered partitions of n; e.g., the partitions of <code>3 (1+1+1,1+2,3)</code> appear as 1,1,1,1,2,3 in row 3.
 * @author Sean A. Irvine
 */
public class A026791 implements Sequence {

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
          return Integer.compare(b[bk], a[ak]);
        });
        mL = mPart.size() - 1;
      }
      mM = mPart.get(mL).length - 1;
    }
    return Z.valueOf(mPart.get(mL)[mM]);
  }
}
