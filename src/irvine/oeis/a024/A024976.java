package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024976.
 * @author Sean A. Irvine
 */
public class A024976 extends A024975 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
