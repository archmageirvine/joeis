package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050705 Composite number such that when sum of its prime factors is added or subtracted becomes prime.
 * @author Sean A. Irvine
 */
public class A050705 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.ZERO;
      final FactorSequence fs = Jaguar.factor(++mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.multiply(fs.getExponent(p)));
      }
      final Z n = Z.valueOf(mN);
      if (n.add(sum).isProbablePrime() && n.subtract(sum).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
