package irvine.oeis.a069;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069118.
 * @author Sean A. Irvine
 */
public class A069123 extends Sequence0 {

  private int mN = 0;
  private IntegerPartition mPartitions = new IntegerPartition(0);

  @Override
  public Z next() {
    int[] p = mPartitions.next();
    if (p == null) {
      mPartitions = new IntegerPartition(++mN);
      p = mPartitions.next();
    }
    Z prod = Z.ONE;
    for (final int v : p) {
      prod = prod.multiply(MemoryFactorial.SINGLETON.factorial(v));
    }
    return prod;
  }
}

