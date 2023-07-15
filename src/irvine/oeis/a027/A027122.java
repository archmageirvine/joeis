package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027122 a(n) = A027113(n, 2n-4).
 * @author Sean A. Irvine
 */
public class A027122 extends A027113 {

  private long mN = 1;

  /** Construct the sequence. */
  public A027122() {
    super(2);
  }

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
