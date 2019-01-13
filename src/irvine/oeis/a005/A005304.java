package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005304.
 * @author Sean A. Irvine
 */
public class A005304 extends A005303 {

  // I'm not sure that the continuation of this power function is correct.

  private static final int[] IRREGULAR_POWERS = {0, 1, 1, 3, 3, 4, 3, 4};

  @Override
  protected int power(final int n) {
    return n < IRREGULAR_POWERS.length ? IRREGULAR_POWERS[n] : ((n & 1) == 0 ? 2 : 4);
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
