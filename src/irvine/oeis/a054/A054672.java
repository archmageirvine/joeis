package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054672 Nearest integer to n^tan(n).
 * @author Sean A. Irvine
 */
public class A054672 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR n = CR.valueOf(mN);
    return n.pow(ComputableReals.SINGLETON.tan(n)).round();
  }
}
