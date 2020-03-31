package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030310.
 * @author Sean A. Irvine
 */
public class A030310 extends A030308 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

