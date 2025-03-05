package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075697.
 * @author Sean A. Irvine
 */
public class A075726 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PI.multiply(Z.valueOf(++mN).square()).round();
  }
}
