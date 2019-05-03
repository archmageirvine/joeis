package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014553 Maximal multiplicative persistence <code>(or length)</code> of any n-digit number.
 * @author Sean A. Irvine
 */
public class A014553 implements Sequence {

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
