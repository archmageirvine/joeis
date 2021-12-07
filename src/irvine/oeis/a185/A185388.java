package irvine.oeis.a185;
// manually egfu/egfurt at 2021-12-07 10:52

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A185388 E.g.f. A(x), where A(x)=x*exp(A(x))+x*log(1/(1-A(x)).
 * E.g.f.: reverse(x/(exp(x)+log((1-x)^(-1)))).
 * A(x) is E.g.f. for a(n)/n.
 * @author Georg Fischer
 */
public class A185388 extends ExponentialGeneratingFunction {

  private int mN;

  /** Construct the sequence. */
  public A185388() {
    super(1);
    mN = 0;
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.reversion(RING.series(RING.x(), RING.add(RING.exp(RING.x(), mN), RING.log(RING.exp(RING.multiply(RING.log(RING.oneMinusXToTheN(1), mN), RING.subtract(RING.zero(), RING.one()), mN), mN), mN)), mN), mN);
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(mN);
  }
}
