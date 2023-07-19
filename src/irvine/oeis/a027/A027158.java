package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027158 a(n) = T(2n,n), T given by A027157.
 * @author Sean A. Irvine
 */
public class A027158 extends A027157 {

  /** Construct the sequence. */
  public A027158() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return t(2 * ++mN, mN);
  }
}
