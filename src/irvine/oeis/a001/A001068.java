package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001068 a(n) = floor(5*n/4), numbers that are congruent to {0, 1, 2, 3} mod 5.
 * @author Sean A. Irvine
 */
public class A001068 extends Sequence0 {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.shiftRight(2);
  }
}

