package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A060436 Numerator of Sum_{k=1..n} d(k)/k, where d() = A000005().
 * @author Sean A. Irvine
 */
public class A060436 extends A000005 {

  private Q mA = Q.ZERO;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mA = mA.add(new Q(super.next(), Z.valueOf(mN)));
    return select(mA);
  }
}

