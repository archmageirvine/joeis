package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026595 a(n) = T(n, floor(n/2)), where T is given by A026584.
 * @author Sean A. Irvine
 */
public class A026595 extends A026584 {

  /** Construct the sequence. */
  public A026595() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
