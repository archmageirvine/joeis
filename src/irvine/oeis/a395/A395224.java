package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395224 Numerator of (zeta(4*n) / zeta(2*n)^2) * (4^n + 1) / (4^n - 1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A395224 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.ONE.shiftLeft(2 * mN);
    return select(mB.get(4 * mN).abs().multiply(2).multiply(Functions.FACTORIAL.z(2 * mN).square())
      .divide(mB.get(2 * mN).square().multiply(Functions.FACTORIAL.z(4 * mN)))
      .multiply(t.add(1))
      .divide(t.subtract(1)));
  }
}
