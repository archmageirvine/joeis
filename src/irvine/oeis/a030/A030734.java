package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030734 Numbers n such that s(n)=2, where s=A030727.
 * @author Sean A. Irvine
 */
public class A030734 extends A030727 {

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

