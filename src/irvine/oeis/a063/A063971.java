package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a013.A013939;

/**
 * A063971 Values of n for which A013939(n)/n is an integer.
 * @author Sean A. Irvine
 */
public class A063971 extends A013939 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

