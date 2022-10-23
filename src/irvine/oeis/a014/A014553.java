package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014553 Maximal multiplicative persistence (or length) of any n-digit number.
 * @author Sean A. Irvine
 */
public class A014553 extends Sequence1 {

  private static final int[] SMALL = {0, 1, 4, 5, 6, 7, 7, 8, 9, 9, 10, 10, 10, 10, 10};
  private static final Z ELEVEN = Z.valueOf(11);

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= 2530) {
      throw new UnsupportedOperationException();
    }
    return mN < SMALL.length ? Z.valueOf(SMALL[mN]) : ELEVEN;
  }
}
