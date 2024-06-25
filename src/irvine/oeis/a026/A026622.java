package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026622 a(n) = Sum_{k=0..n} A026615(n, k).
 * @author Sean A. Irvine
 */
public class A026622 extends A026615 {

  /** Construct the sequence. */
  public A026622() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
