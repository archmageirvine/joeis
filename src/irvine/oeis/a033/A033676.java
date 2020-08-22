package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033676 Largest divisor of n &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A033676 implements Sequence {

  protected long mN = 0;
  
  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    final Z[] d = Cheetah.factor(mN).divisorsSorted();
    return d[(d.length - 1) / 2];
  }
}
