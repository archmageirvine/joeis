package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030764 Numbers n such that <code>s(n)=2</code>, where <code>s=A030757</code>.
 * @author Sean A. Irvine
 */
public class A030764 extends A030757 {

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

