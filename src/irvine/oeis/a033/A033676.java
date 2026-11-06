package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A033676 Largest divisor of n &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A033676 extends Sequence1 implements DirectSequence {

  protected long mN = 0;
  
  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.compareTo(Z.FOUR) < 0) {
      return Z.ONE;
    }
    final Z[] d = Jaguar.factor(n).divisorsSorted();
    return d[(d.length - 1) / 2];
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
