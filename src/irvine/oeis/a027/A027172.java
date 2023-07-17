package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027172 a(n) = (1/2) * A027170(2n, n).
 * @author Sean A. Irvine
 */
public class A027172 extends A027170 {

  /** Construct the sequence. */
  public A027172() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN).divide2();
  }
}
