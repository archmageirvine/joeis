package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030773 <code>s(k)=1</code>, where <code>s=A030767</code>.
 * @author Sean A. Irvine
 */
public class A030773 extends A030767 {

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

