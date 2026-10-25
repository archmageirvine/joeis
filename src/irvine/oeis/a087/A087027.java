package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087027 a(n) = n*m where * is lunar multiplication and m is the ordinary sum n+1.
 * @author Sean A. Irvine
 */
public class A087027 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return A087062.lunarMul(Z.valueOf(++mN), Z.valueOf(mN + 1));
  }
}
