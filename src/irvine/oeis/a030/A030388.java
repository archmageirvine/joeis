package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030388 Position of <code>n-th 1</code> in <code>A030386</code>.
 * @author Sean A. Irvine
 */
public class A030388 extends A030386 {

  private long mN = -1;

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

