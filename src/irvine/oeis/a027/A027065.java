package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027065 a(n) = A027052(n, 2n-9).
 * @author Sean A. Irvine
 */
public class A027065 extends A027052 {

  /** Construct the sequence. */
  public A027065() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 9);
  }
}
