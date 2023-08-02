package irvine.oeis.a157;
// manually tresimple at 2023-07-12

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A157528 Triangle read by rows: T(n, k) = 2*k*(n - k) with T(n, 0) = T(n, n) = 1.
 * @author Georg Fischer
 */
public class A157528 extends BaseTriangle {

  /** Construct the sequence. */
  public A157528() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // A157528 := proc(n, k) if k=0 or k=n then 1; else 2*k*(n-k) ; end if; end proc:
    return Z.valueOf((k == 0 || k == n) ? 1 : 2L * k * (n - k));
  }
}
