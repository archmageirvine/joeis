package irvine.oeis.a058;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058699 a(n) = p(p(n)), p = partition numbers A000041.
 * @author Sean A. Irvine
 */
public class A058699 extends A000041 {

  @Override
  public Z next() {
    return IntegerPartition.partitions(super.next().intValueExact());
  }
}
