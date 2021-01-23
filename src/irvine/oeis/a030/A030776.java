package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030776 Numbers n such that s(n)=4, where s=A030767.
 * @author Sean A. Irvine
 */
public class A030776 extends A030767 {

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

