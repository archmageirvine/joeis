package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001227;

/**
 * A066272 Number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066272 extends A001227 implements DirectSequence {

  @Override
  public Z next() {
    return super.next().subtract(5).add(Jaguar.factor(2 * mN - 1).sigma0()).add(Jaguar.factor(2 * mN + 1).sigma0()).max(Z.ZERO);
  }

  @Override
  public Z a(final Z n) {
    long c = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isOdd()) {
        ++c;
      }
    }
    final Z n2 = n.multiply2();
    final Z s0 = Jaguar.factor(n2.subtract(1)).sigma0();
    final Z s1 = Jaguar.factor(n2.add(1)).sigma0();
    return s0.add(s1).add(c - 5);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
