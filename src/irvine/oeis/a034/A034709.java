package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034709 Numbers divisible by their last digit.
 * @author Sean A. Irvine
 */
public class A034709 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      final long d = ++mN % 10;
      if (d != 0 && mN % d == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

