package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A085078 The largest number with the prime signature of n! using primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A085078 extends Sequence1 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(mF.next());
    final Z[] p = fs.toZArray();
    Z prod = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      prod = prod.multiply(p[k].pow(fs.getExponent(p[p.length - 1 - k])));
    }
    return prod;
  }
}

