package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392081 allocated for Sean Lipton.
 * @author Sean A. Irvine
 */
public class A392081 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // Used fixed length partitions here, so we can avoid generating cases containing a 1
    final HashSet<Z> set = new HashSet<>();
    for (int parts = 1; parts <= mN / 2; ++parts) {
      final FixedLengthPartition partitions = new FixedLengthPartition(mN, parts, 2, mN);
      int[] p;
      while ((p = partitions.next()) != null) {
        set.add(Functions.LCM.z(p));
      }
    }
    return Z.valueOf(set.size());
  }
}
