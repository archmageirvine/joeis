package irvine.oeis.a328;
// manually 2025-04-01 direct

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A328114 Maximal digit value used when n is written in primorial base (cf. A049345).
 * @author Georg Fischer
 */
public class A328114 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A328114() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(Jaguar.factor(Functions.PRIMORIAL_BASE_EXP.z(n)).maxExponent());
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(Jaguar.factor(Functions.PRIMORIAL_BASE_EXP.z(n)).maxExponent());
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
