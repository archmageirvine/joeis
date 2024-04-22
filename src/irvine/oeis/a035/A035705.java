package irvine.oeis.a035;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035705 Numbers k such that the numbers of partitions and partitions-into-distinct-parts of k have a prime GCD.
 * @author Sean A. Irvine
 */
public class A035705 extends A000009 {

  {
    setOffset(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final int index = ++mN;
      if (super.next().gcd(Functions.PARTITIONS.z(index)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

