package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389832 Multiplicative sequence a(n) with a(p^e) = abs(2 - (e mod 4)) for prime p and e &gt; 0.
 * @author Sean A. Irvine
 */
public class A389832 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Math.abs(2 - (fs.getExponent(p) & 3)));
    }
    return prod;
  }
}

