package irvine.oeis.a010;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000961;

/**
 * A010055 1 if n is a prime power p^k (k &gt;= 0), otherwise 0.
 * @author Sean A. Irvine
 */
public class A010055 extends A000961 implements DirectSequence {

  private Z mNext = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mNext)) {
      mNext = super.next();
      return Z.ONE;
    }
    return Z.ZERO;
  }

  @Override
  public Z a(final Z n) {
    return n.equals(Z.ONE) ? Z.ONE : (Predicates.PRIME_POWER.is(n) ? Z.ONE : Z.ZERO);
  }

  @Override
  public Z a(final int n) {
    return n == 1 ? Z.ONE : (Predicates.PRIME_POWER.is(n) ? Z.ONE : Z.ZERO);
  }

}
