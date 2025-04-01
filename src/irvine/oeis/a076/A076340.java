package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A076340 Real part of the function defined multiplicatively on the complex numbers by 2-&gt;(2,0) and p-&gt;((floor(p/4)+floor((p mod 4)/2))*4,2-(p mod 4)) for odd primes p.
 * @author Sean A. Irvine
 */
public class A076340 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  protected Z select(final Zi n) {
    return n.re();
  }

  @Override
  public Z a(final Z n) {
    Zi prod = Zi.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Zi t = Z.TWO.equals(p) ? new Zi(2) : new Zi(p.divide(4).add(p.and(Z.THREE).divide2()).multiply(4), Z.TWO.subtract(p.and(Z.THREE)));
      prod = prod.multiply(t.pow(e));
    }
    return select(prod);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
