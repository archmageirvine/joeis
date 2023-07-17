package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027060 a(n) = T(n,2n-4), T given by A027052.
 * @author Sean A. Irvine
 */
public class A027060 extends A027052 {

  /** Construct the sequence. */
  public A027060() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2 * mN - 4);
  }
}
