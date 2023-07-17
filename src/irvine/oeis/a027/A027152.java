package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027152 T(n,0) + T(n,1) + ... + T(n,[ n/2 ]), T given by A027144.
 * @author Sean A. Irvine
 */
public class A027152 extends A027144 {

  /** Construct the sequence. */
  public A027152() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
