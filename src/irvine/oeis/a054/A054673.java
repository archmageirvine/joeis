package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054673 Nearest integer to n^sin(n).
 * @author Sean A. Irvine
 */
public class A054673 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR n = CR.valueOf(mN);
    return n.pow(n.sin()).round();
  }
}
