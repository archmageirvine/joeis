package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031305 Position of <code>n-th 6</code> in <code>A031298</code>.
 * @author Sean A. Irvine
 */
public class A031305 extends A031298 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

