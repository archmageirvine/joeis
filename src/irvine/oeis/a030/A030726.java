package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030726 n-th number k such that s(k)=4, where s=A030717.
 * @author Sean A. Irvine
 */
public class A030726 extends A030717 {

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

