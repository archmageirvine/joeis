package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024707.
 * @author Sean A. Irvine
 */
public class A024707 extends A024702 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(5) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
