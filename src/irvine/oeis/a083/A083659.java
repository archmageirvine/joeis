package irvine.oeis.a083;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A083659 Denominator of fraction equal to the continued fraction [p(n); p(n-1),...,5,3,2].
 * @author Sean A. Irvine
 */
public class A083659 extends A000040 {

  private Q mB = null;

  @Override
  public Z next() {
    mB = mB == null ? Q.valueOf(super.next()) : mB.reciprocal().add(super.next());
    return mB.den();
  }
}
