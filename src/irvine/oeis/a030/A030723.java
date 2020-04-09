package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030723 <code>s(n)=1</code>, where <code>s=A030717</code>.
 * @author Sean A. Irvine
 */
public class A030723 extends A030717 {

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

