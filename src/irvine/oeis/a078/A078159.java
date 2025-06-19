package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078159 a(n) = A055086(2^n).
 * @author Sean A. Irvine
 */
public class A078159 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CEIL_SQRT.z(Z.ONE.shiftLeft(++mN).add(1).shiftLeft(2)).subtract(2);
  }
}
