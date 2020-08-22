package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030786 n-th number k such that s(k)=4, where s=A030777.
 * @author Sean A. Irvine
 */
public class A030786 extends A030777 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

