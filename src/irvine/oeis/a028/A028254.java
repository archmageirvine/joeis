package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028254 Engel expansion of <code>sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A028254 implements Sequence {

  private CR mA = CR.SQRT2;

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil();
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
