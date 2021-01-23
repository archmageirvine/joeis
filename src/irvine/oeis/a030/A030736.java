package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030736 n-th number k such that s(k)=4, where s=A030727.
 * @author Sean A. Irvine
 */
public class A030736 extends A030727 {

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

