package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062356 a(n) = floor(n/phi(n)).
 * @author Sean A. Irvine
 */
public class A062356 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN / Functions.PHI.l(mN));
  }
}
