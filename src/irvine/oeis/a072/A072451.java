package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072444.
 * @author Sean A. Irvine
 */
public class A072451 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Functions.PHI.z(2L * mN - 1).divide2();
  }
}
