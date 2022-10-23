package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007067 Nearest integer to n*tau.
 * @author Sean A. Irvine
 */
public class A007067 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).round();
  }
}
