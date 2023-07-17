package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026546 a(n) = T(2n-1,n-2), T given by A026536.
 * @author Sean A. Irvine
 */
public class A026546 extends A026536 {

  /** Construct the sequence. */
  public A026546() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN - 1, mN - 2);
  }
}
