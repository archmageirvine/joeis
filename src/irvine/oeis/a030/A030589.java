package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030589 Position of <code>n-th 0</code> in <code>A030588</code>.
 * @author Sean A. Irvine
 */
public class A030589 extends A030588 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

