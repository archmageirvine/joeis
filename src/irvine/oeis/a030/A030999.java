package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030999 Position of <code>n-th 0</code> in <code>A030998</code>.
 * @author Sean A. Irvine
 */
public class A030999 extends A030998 {

  private long mN = -1;

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

