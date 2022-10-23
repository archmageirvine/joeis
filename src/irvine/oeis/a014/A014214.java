package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014214 [ (Pi/2)^n ].
 * @author Sean A. Irvine
 */
public class A014214 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.HALF_PI, ++mN).floor();
  }
}
