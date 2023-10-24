package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066519 Gaps between successive numbers with an anti-divisor class sum of zero.
 * @author Sean A. Irvine
 */
public class A066519 extends A066518 {

  {
    super.next();
  }

  @Override
  public Z next() {
    long gap = 0;
    while (true) {
      ++gap;
      if (super.next().isZero()) {
        return Z.valueOf(gap);
      }
    }
  }
}
