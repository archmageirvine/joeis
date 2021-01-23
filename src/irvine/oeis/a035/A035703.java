package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035703 Numbers n such that numbers of partitions and partitions-into-distinct-parts of n have a common factor.
 * @author Sean A. Irvine
 */
public class A035703 extends A000009 {

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

