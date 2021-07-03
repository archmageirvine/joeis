package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035705 Numbers k such that the numbers of partitions and partitions-into-distinct-parts of k have a prime GCD.
 * @author Sean A. Irvine
 */
public class A035705 extends A000009 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (super.next().gcd(IntegerPartition.partitions(++mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

