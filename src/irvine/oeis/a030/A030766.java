package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030766.
 * @author Sean A. Irvine
 */
public class A030766 extends A030757 {

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

