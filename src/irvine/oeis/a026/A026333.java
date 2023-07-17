package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026333 a(n) = T(3n,n), where T is the array in A026323.
 * @author Sean A. Irvine
 */
public class A026333 extends A026323 {

  /** Construct the sequence. */
  public A026333() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
