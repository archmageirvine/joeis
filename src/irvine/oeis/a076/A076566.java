package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076566 Greatest prime divisor of 3n+3 (sum of three successive integers).
 * @author Sean A. Irvine
 */
public class A076566 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    mN += 3;
    return Functions.GPF.z(mN);
  }
}
