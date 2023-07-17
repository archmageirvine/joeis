package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027063 a(n) = A027052(n, 2n-7).
 * @author Sean A. Irvine
 */
public class A027063 extends A027052 {

  /** Construct the sequence. */
  public A027063() {
    super(4);
  }

  private long mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 7);
  }
}
