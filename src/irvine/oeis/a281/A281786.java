package irvine.oeis.a281;
// Generated by gen_seq4.pl mult/multb at 2022-08-01 11:56

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A281786 Expansion of a(q) * b(q^2) + a(q^2) * b(q) in powers of q where a(), b() are cubic AGM functions.
 * @author Georg Fischer
 */
public class A281786 extends MultiplicativeSequence implements DirectSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A281786() {
    super(0, (p, e) -> is2(p) ? Z.ONE : (is3(p) ? Z.valueOf(-8) : sigmaP(p, e)));
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? super.a(n).add(1) : super.a(n).multiply(3);
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
