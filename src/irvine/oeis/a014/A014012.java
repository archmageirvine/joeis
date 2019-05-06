package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014012 Engel expansion of <code>1/Pi</code>.
 * @author Sean A. Irvine
 */
public class A014012 implements Sequence {

  // Engel expansion

  private CR mA = CR.PI.inverse();

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil();
    mA = mA.multiply(CR.valueOf(a)).subtract(CR.ONE);
    return a;
  }
}
