package irvine.oeis.a262;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002828;

/**
 * A262690 a(n) = largest square k &lt;= n such that A002828(n-k) = A002828(n)-1.
 * @author Sean A. Irvine
 */
public class A262690 extends Sequence0 {

  private final DirectSequence mA = DirectSequence.create(new A002828());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z t = mA.a(mN).subtract(1);
    int k = Functions.SQRT.i(mN);
    while (true) {
      if (mA.a(mN - k * k).equals(t)) {
        return Z.valueOf((long) k * k);
      }
      --k;
    }
  }
}
