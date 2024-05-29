package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069943 a(n) = numerator(b(n)), where b(1) = b(2) = 1, b(n) = (b(n-1) + b(n-2))/(n-1).
 * @author Sean A. Irvine
 */
public class A069943 extends Sequence1 {

  private Q mA = Q.ONE;
  private Q mB = Q.ONE;
  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      final Q t = mA.add(mB).divide(mN);
      mA = mB;
      mB = t;
    }
    return select(mB);
  }
}
