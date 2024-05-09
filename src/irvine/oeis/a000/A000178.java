package irvine.oeis.a000;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PartialProductSequence;

/**
 * A000178 Superfactorials: product of first n factorials.
 * Also <code>a(n) = BarnesG(n-2)</code>
 * @author Sean A. Irvine
 */
public class A000178 extends PartialProductSequence implements DirectSequence {

  /** Construct the sequence. */
  public A000178() {
    super(new A000142());
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(0) = 1, a(n) = 1^n * 2^(n-1) * 3^(n-2) * ... * n = Product_{r=1..n} r^(n-r+1).
    return n == 0 ? Z.ONE : Integers.SINGLETON.product(1, n, r -> Z.valueOf(r).pow(n - r + 1));
  }
}
