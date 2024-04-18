package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062777 a(n) = 2^n - mu(n).
 * @author Sean A. Irvine
 */
public class A062777 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(Functions.MOBIUS.i((long) mN));
  }
}
