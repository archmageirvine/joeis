package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026164 a(n) = Sum{T(n,k)}, k = 0,1,...,n, where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026164 extends A026148 {

  /** Construct the sequence. */
  public A026164() {
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
