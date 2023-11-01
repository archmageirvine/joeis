package irvine.oeis.a181;
// manually multman/mult at 2023-10-03 10:18

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A181549 a(n) = Sum_{k|n} k*mu_2(n/k).
 * Multiplicative with: a(p)= p + 1, and a(p^e) = p^e + p^(e-1) - p^(e-2) if e > 1.
 * @author Georg Fischer
 */
public class A181549 extends MultiplicativeSequence implements DirectSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A181549() {
    super(0, (p, e) -> (e == 1) ? p.add(1) : p.pow(e).add(p.pow(e - 1)).subtract(p.pow(e - 2)));
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : super.a(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
