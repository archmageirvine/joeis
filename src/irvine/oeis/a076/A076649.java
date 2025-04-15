package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076649 Number of digits required to write the prime factors of n.
 * @author Sean A. Irvine
 */
public class A076649 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum += Functions.DIGIT_LENGTH.l(p) * e;
    }
    return Z.valueOf(sum);
  }
}
