package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030403.
 * @author Sean A. Irvine
 */
public class A030403 extends A030401 {

  private long mN = 0;

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

