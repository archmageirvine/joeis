package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030784 s(n)=2, where s=A030777.
 * @author Sean A. Irvine
 */
public class A030784 extends A030777 {

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

