package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030415 Position of <code>n-th 1</code> in <code>A030413</code>.
 * @author Sean A. Irvine
 */
public class A030415 extends A030413 {

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

