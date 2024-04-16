package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062509 a(n) = n^omega(n).
 * @author Sean A. Irvine
 */
public class A062509 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(Functions.OMEGA.i(mN));
  }
}
