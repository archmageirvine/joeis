package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389489 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A389489 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++k);
      Z sum = Z.valueOf(k);
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(mN).multiply(fs.getExponent(p)));
      }
      if (sum.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
