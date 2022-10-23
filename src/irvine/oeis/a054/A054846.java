package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054846 Nearest integer to n^(2/3).
 * @author Sean A. Irvine
 */
public class A054846 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).square()).pow(CR.ONE_THIRD).round();
  }
}
