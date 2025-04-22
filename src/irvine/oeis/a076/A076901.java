package irvine.oeis.a076;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a182.A182927;

/**
 * A076901 E.g.f.: 1/Product_{m&gt;0} (1+(-x)^m/m!).
 * @author Sean A. Irvine
 */
public class A076901 extends Sequence0 {

  // After Peter Luschny

  private int mN = -1;
  private final DirectSequence mS = new A182927();
  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n - 1, k - 1).multiply(k == 0 ? Z.ZERO : mS.a(k).negate()).multiply(get(n - k)));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN).multiply(Z.NEG_ONE.pow(mN));
  }
}
