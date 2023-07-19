package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027163 a(n) = T(n,[ n/2 ]), T given by A027157.
 * @author Sean A. Irvine
 */
public class A027163 extends A027157 {

  /** Construct the sequence. */
  public A027163() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN / 2);
  }
}
