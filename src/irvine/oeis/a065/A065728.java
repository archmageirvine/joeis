package irvine.oeis.a065;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A065728 Partition numbers <code>(A000041)</code> that are semiprimes <code>(A001358)</code>.
 * @author Sean A. Irvine
 */
public class A065728 extends A065729 {

  @Override
  public Z next() {
    return IntegerPartition.partitions(super.next().intValueExact());
  }
}
