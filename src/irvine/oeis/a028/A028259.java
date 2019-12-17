package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028259 Engel expansion of the golden ratio, <code>(1 + sqrt(5))/2 = 1.61803... </code>.
 * @author Sean A. Irvine
 */
public class A028259 implements Sequence {

  private CR mA = CR.PHI;

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil();
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
