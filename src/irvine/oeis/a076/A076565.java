package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076565 Greatest prime divisor of 2n+1 (sum of two successive integers).
 * @author Sean A. Irvine
 */
public class A076565 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.GPF.z(mN);
  }
}
