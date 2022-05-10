package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030794 s(n) = 2, where s = A030787.
 * @author Sean A. Irvine
 */
public class A030794 extends A030787 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

