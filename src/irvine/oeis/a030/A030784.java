package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030784 <code>s(n)=2</code>, where <code>s=A030777</code>.
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

