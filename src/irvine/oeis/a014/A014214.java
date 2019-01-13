package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014214.
 * @author Sean A. Irvine
 */
public class A014214 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(CR.HALF_PI, ++mN).floor(32);
  }
}
