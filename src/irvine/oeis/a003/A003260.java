package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001348;

/**
 * A003260.
 * @author Sean A. Irvine
 */
public class A003260 extends A001348 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    final Z[] f = fs.toZArray();
    return f[f.length - 1];
  }
}
