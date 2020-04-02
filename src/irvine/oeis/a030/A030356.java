package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030356 Position of <code>n-th 2</code> in <code>A030353</code>.
 * @author Sean A. Irvine
 */
public class A030356 extends A030353 {

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

