package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076567 Greatest prime divisor of 4n+6 (sum of four successive integers).
 * @author Sean A. Irvine
 */
public class A076567 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    mN += 4;
    return Functions.GPF.z(mN);
  }
}
