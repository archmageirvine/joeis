package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A051904 Minimal exponent in prime factorization of n.
 * @author Sean A. Irvine
 */
public class A051904 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(Jaguar.factor(n).minExponent());
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).minExponent());
  }
}
