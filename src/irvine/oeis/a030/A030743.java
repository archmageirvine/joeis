package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030743 s(k)=1, where s=A030737.
 * @author Sean A. Irvine
 */
public class A030743 extends A030737 {

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

