package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035703 Numbers k such that the numbers of partitions and partitions-into-distinct-parts of k have a common factor.
 * @author Sean A. Irvine
 */
public class A035703 extends A000009 {

  {
    setOffset(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (!Z.ONE.equals(super.next().gcd(IntegerPartition.partitions(++mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

