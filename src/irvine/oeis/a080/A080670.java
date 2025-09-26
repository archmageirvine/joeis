package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080670 Literal reading of the prime factorization of n.
 * @author Sean A. Irvine
 */
public class A080670 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      sb.append(p);
      final int e = fs.getExponent(p);
      if (e > 1) {
        sb.append(e);
      }
    }
    return new Z(sb);
  }
}
