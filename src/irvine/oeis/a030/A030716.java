package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030716 Numbers n such that <code>s(n)=4</code>, where <code>s=A030707</code>.
 * @author Sean A. Irvine
 */
public class A030716 extends A030707 {

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

