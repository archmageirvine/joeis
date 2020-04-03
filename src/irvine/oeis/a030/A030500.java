package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030500 Position of <code>n-th 4</code> in <code>A030496</code>.
 * @author Sean A. Irvine
 */
public class A030500 extends A030496 {

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

