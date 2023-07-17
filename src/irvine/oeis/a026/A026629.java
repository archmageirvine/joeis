package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026629 T(2n,n-2), T given by A026626.
 * @author Sean A. Irvine
 */
public class A026629 extends A026626 {

  /** Construct the sequence. */
  public A026629() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
