package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033676 Largest divisor of n &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A033676 extends Sequence1 {

  protected long mN = 0;
  
  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final Z[] d = Jaguar.factor(mN).divisorsSorted();
    return d[(d.length - 1) / 2];
  }
}
