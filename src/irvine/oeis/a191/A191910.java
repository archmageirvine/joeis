package irvine.oeis.a191;
// manually tresimple at 2023-07-12

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A191910 Triangle read by rows: T(n,n)=n; T(n,k) = k-1 if k divides n and k &lt; n, otherwise -1.
 * @author Georg Fischer
 */
public class A191910 extends BaseTriangle {

  /** Construct the sequence. */
  public A191910() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Z.valueOf((k == n) ? n : (((n % k) == 0) ? k - 1 : -1));
  }
}
