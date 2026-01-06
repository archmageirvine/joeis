package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392055 allocated for Rick Zhou.
 * @author Sean A. Irvine
 */
public class A392055 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    if (fs.omega() != 1) {
      return Z.ONE;
    }
    final Z p = fs.toZArray()[0];
    return p.mod(4) == 1 ? Z.ONE : p;
  }
}
