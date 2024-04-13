package irvine.oeis.a035;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035704 Numbers k such that the numbers of partitions and partitions-into-distinct-parts of k have a common factor greater than 2.
 * @author Sean A. Irvine
 */
public class A035704 extends A000009 {

  {
    setOffset(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.compareTo(super.next().gcd(IntegerPartition.partitions(++mN))) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

