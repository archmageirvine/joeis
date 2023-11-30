package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A366144 a(n) = n/d(n) if d(n) | n, otherwise a(n) = n*d(n), where d(n) = A000005(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A366144 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A366144() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final Z dn = Jaguar.factor(n).sigma0();
    final Z[] quot = n.divideAndRemainder(dn);
    return quot[1].isZero() ? quot[0] : n.multiply(dn);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
