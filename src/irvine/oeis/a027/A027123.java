package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027123 a(n) = A027113(n, 2n-5).
 * @author Sean A. Irvine
 */
public class A027123 extends A027113 {

  private long mN = 2;

  /** Construct the sequence. */
  public A027123() {
    super(3);
  }

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 5);
  }
}
