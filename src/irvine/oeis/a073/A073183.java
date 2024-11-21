package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073183 Sum of divisors of n that are not greater than the cubefree kernel of n.
 * @author Sean A. Irvine
 */
public class A073183 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z cfk = Z.ONE;
    for (final Z p : fs.toZArray()) {
      cfk = cfk.multiply(p.pow(Math.min(2, fs.getExponent(p))));
    }
    Z sum = Z.ZERO;
    for (final Z d : fs.divisors()) {
      if (d.compareTo(cfk) <= 0) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
