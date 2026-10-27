package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087036 Lunar cubes: n*n*n, where * is lunar multiplication.
 * @author Sean A. Irvine
 */
public class A087036 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return A087062.lunarMul(A087062.lunarMul(n, n), n);
  }
}
