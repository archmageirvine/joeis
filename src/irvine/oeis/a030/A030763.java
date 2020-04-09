package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030763 <code>s(n)=1</code>, where <code>s=A030757</code>.
 * @author Sean A. Irvine
 */
public class A030763 extends A030757 {

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

