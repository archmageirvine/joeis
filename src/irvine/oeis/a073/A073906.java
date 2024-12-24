package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073906 Number of conjugacy classes in the symmetric group S_n with distinct cardinality.
 * @author Sean A. Irvine
 */
public class A073906 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final HashSet<Z> s = new HashSet<>();
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      s.add(IntegerPartition.permCount(p));
    }
    return Z.valueOf(s.size());
  }
}

