package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027162 a(n) = T(2n-1,n-2), T given by A027157.
 * @author Sean A. Irvine
 */
public class A027162 extends A027157 {

  /** Construct the sequence. */
  public A027162() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 2);
  }
}
