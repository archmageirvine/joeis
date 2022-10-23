package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056624 Number of unitary square divisors of n.
 * @author Sean A. Irvine
 */
public class A056624 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 0) {
        ++cnt;
      }
    }
    return Z.ONE.shiftLeft(cnt);
  }
}
