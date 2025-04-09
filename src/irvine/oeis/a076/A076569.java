package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076569 Greatest prime divisor of 6n+15 (sum of six successive integers).
 * @author Sean A. Irvine
 */
public class A076569 extends Sequence1 {

  private long mN = 15;

  @Override
  public Z next() {
    mN += 6;
    return Functions.GPF.z(mN);
  }
}
