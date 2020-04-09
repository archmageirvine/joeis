package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030766 Numbers n such that <code>s(n)=4</code>, where <code>s=A030757</code>.
 * @author Sean A. Irvine
 */
public class A030766 extends A030757 {

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

