package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A035701 Number of partitions-into-distinct-parts of n is a multiple of 12.
 * @author Sean A. Irvine
 */
public class A035701 extends A000009 {

  {
    setOffset(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(12) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

