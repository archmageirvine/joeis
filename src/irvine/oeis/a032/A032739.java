package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032739 a(n) = floor( (Pi/e)^n ).
 * @author Sean A. Irvine
 */
public class A032739 implements Sequence {

  private static final CR PI_DIV_E = CR.PI.divide(CR.E);
  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(PI_DIV_E, ++mN).floor();
  }
}
