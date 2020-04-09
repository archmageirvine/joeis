package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030774 Numbers n such that <code>s(n)=2</code>, where <code>s=A030767</code>.
 * @author Sean A. Irvine
 */
public class A030774 extends A030767 {

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

