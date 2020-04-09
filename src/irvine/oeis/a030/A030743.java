package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030743 <code>s(k)=1</code>, where <code>s=A030737</code>.
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

