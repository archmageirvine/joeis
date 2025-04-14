package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076690 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf((Functions.GPF.l(++mN) + Functions.LPF.l(mN) + 1) / 2);
  }
}
