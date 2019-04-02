package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006784 Engel expansion of Pi.
 * @author Sean A. Irvine
 */
public class A006784 implements Sequence {

  // Engel expansion

  private CR mA = CR.PI;

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(32);
    mA = mA.multiply(CR.valueOf(a)).subtract(CR.ONE);
    return a;
  }
}
