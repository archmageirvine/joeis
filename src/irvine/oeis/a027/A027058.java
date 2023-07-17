package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027058 a(n) = A027052(n, 2n-2).
 * @author Sean A. Irvine
 */
public class A027058 extends A027052 {

  /** Construct the sequence. */
  public A027058() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 2);
  }
}
