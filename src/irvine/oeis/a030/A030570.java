package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030570 Position of <code>n-th 2</code> in <code>A030567</code>.
 * @author Sean A. Irvine
 */
public class A030570 extends A030567 {

  private long mN = -1;

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

