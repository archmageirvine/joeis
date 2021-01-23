package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024706 Positions of multiples of 3 in A024702.
 * @author Sean A. Irvine
 */
public class A024706 extends A024702 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
