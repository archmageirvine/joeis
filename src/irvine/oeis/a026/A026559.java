package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026559 a(n) = T(2*n, n-1), where T is given by A026552.
 * @author Sean A. Irvine
 */
public class A026559 extends A026552 {

  /** Construct the sequence. */
  public A026559() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
