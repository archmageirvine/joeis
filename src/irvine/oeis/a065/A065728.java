package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A065728 Partition numbers (A000041) that are semiprimes (A001358).
 * @author Sean A. Irvine
 */
public class A065728 extends A065729 {

  @Override
  public Z next() {
    return Functions.PARTITIONS.z(super.next());
  }
}
