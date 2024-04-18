package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066228 The EulerPhi(sigma(EulerPhi))-perfect numbers, where the f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066228 extends Sequence1 {

  private int mN = 1;
  private final MemoryFunction1<Long> mF = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Functions.PHI.l(Functions.SIGMA.z(Functions.PHI.z(n)));
    }
  };

  private boolean is(final int n) {
    long sum = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum += mF.get(d.intValueExact());
    }
    return sum == 2 * mF.get(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN < 0) {
        throw new UnsupportedOperationException();
      }
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
