package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030554 Position of <code>n-th 5</code> in <code>A030548</code>.
 * @author Sean A. Irvine
 */
public class A030554 extends A030548 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

