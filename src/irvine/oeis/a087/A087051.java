package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087051 Lunar fourth powers: n*n*n*n, where * is lunar multiplication.
 * @author Sean A. Irvine
 */
public class A087051 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = A087062.lunarMul(n, n);
    return A087062.lunarMul(n2, n2);
  }
}
