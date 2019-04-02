package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014012 Engel expansion of 1/Pi.
 * @author Sean A. Irvine
 */
public class A014012 implements Sequence {

  // Engel expansion

  private CR mA = CR.PI.inverse();

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(32);
    mA = mA.multiply(CR.valueOf(a)).subtract(CR.ONE);
    return a;
  }
}
