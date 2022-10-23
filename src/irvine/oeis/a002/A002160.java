package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002160 Nearest integer to Pi^n.
 * @author Sean A. Irvine
 */
public class A002160 extends Sequence0 {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  private long mN = -1;

  @Override
  public Z next() {
    return REALS.pow(CR.PI, ++mN).round();
  }
}
