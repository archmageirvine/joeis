package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026332 a(n) = T(2n,n), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026332 extends A026323 {

  /** Construct the sequence. */
  public A026332() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
