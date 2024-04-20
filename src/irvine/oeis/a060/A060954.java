package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060954 Largest prime factor of 10*n + 1.
 * @author Sean A. Irvine
 */
public class A060954 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 10;
    return Functions.GPF.z(mN);
  }
}
