package irvine.oeis.a066;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066639 Number of partitions of n with floor(n/2) parts.
 * @author Sean A. Irvine
 */
public class A066639 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return IntegerPartition.partitions((++mN + 1) / 2).add(Z.NEG_ONE.pow(mN).subtract(1).divide2());
  }
}
