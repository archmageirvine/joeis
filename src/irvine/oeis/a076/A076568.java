package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076568 Greatest prime divisor of 5n+10 (sum of five successive integers).
 * @author Sean A. Irvine
 */
public class A076568 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    mN += 5;
    return Functions.GPF.z(mN);
  }
}
