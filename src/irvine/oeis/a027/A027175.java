package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027175 a(n) = A027170(2n-1, n-1).
 * @author Sean A. Irvine
 */
public class A027175 extends A027170 {

  /** Construct the sequence. */
  public A027175() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN - 1, mN - 1);
  }
}
