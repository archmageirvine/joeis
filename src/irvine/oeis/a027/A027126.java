package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027126 a(n) = A027113(n, 2n-8).
 * @author Sean A. Irvine
 */
public class A027126 extends A027113 {

  private long mN = 3;

  /** Construct the sequence. */
  public A027126() {
    super(4);
  }

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 8);
  }
}
