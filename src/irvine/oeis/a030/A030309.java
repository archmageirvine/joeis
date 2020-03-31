package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030309.
 * @author Sean A. Irvine
 */
public class A030309 extends A030308 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

