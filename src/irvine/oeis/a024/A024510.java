package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004431;

/**
 * A024510 Positions of even numbers in A004431 (sums of 2 distinct nonzero squares).
 * @author Sean A. Irvine
 */
public class A024510 extends A004431 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}

