package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056169 Number of unitary prime divisors of n.
 * @author Sean A. Irvine
 */
public class A056169 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
