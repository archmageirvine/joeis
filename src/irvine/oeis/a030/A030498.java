package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030498 Position of <code>n-th 2</code> in <code>A030496</code>.
 * @author Sean A. Irvine
 */
public class A030498 extends A030496 {

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

