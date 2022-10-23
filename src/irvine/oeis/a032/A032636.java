package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032636 [ n^3 / e ].
 * @author Sean A. Irvine
 */
public class A032636 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(Z.valueOf(++mN).pow(3)).divide(CR.E).floor();
  }
}
