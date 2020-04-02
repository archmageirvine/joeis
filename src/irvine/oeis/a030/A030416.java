package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030416 Position of <code>n-th 2</code> in <code>A030413</code>.
 * @author Sean A. Irvine
 */
public class A030416 extends A030413 {

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

