package irvine.oeis.a238;
// manually at 2022-03-26

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A238693 Quotients connected with the Banach matchboxes problem: Sum_{i=1..prime(n)-5} 2^(i-1)*binomial(i+1,2)/prime(n) (case 2).
 * @author Georg Fischer
 */
public class A238693 extends A000040 {

  /** Construct the sequence. */
  public A238693() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param offset sequence offset
   */
  public A238693(final int offset) {
    setOffset(offset);
    for (int ip = 1; ip < offset; ++ip) {
      super.next();
    }
  }

  @Override
  public Z next() {
    final int p = super.next().intValue();
    Q sum = Q.ZERO;
    for (int i = 1; i <= p - 2 * getOffset() + 1; ++i) {
      sum = sum.add(new Q(Z.ONE.shiftLeft(i - 1).multiply(Binomial.binomial(i + getOffset() - 2, getOffset() - 1)), Z.valueOf(p)));
    }
    return sum.num();
  }
}
