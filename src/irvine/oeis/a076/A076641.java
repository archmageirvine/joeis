package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076641 Integers read backwards, but with repetitions omitted.
 * @author Sean A. Irvine
 */
public class A076641 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0 && mN % 10 == 0) {
      ++mN;
    }
    return Functions.REVERSE.z(mN);
  }
}
