package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a265.A265607;

/**
 * A002669 Numerator of constant term in polynomial arising from numerical integration formula.
 * @author Sean A. Irvine
 */
public class A002669 extends A265607 {

  /** Construct the sequence. */
  public A002669() {
    super(1);
  }

  private int mN = 0;
  private Z mF = Z.ONE;

  {
    super.next();
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN).multiply(mN);
    Z sum = Z.ZERO;
    Z v = Z.ONE;
    for (int j = 0; j <= mN; ++j) {
      sum = sum.add(super.next().multiply(v));
      v = v.multiply(-mN);
    }
    return select(new Q(sum, mF));
  }
}
