package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035704 Numbers n such that numbers of partitions and partitions-into-distinct-parts of n have a common factor greater than 2.
 * @author Sean A. Irvine
 */
public class A035704 extends A000009 {

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

