package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014213 Floor((e/2)^n).
 * @author Sean A. Irvine
 */
public class A014213 implements Sequence {

  private static final CR E2 = CR.E.divide(CR.TWO);
  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(E2, ++mN).floor();
  }
}
