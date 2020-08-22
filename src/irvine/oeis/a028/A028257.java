package irvine.oeis.a028;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028257 Engel expansion of sqrt(3).
 * @author Sean A. Irvine
 */
public class A028257 implements Sequence {

  private CR mA = CR.THREE.sqrt();

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil();
    mA = mA.multiply(a).subtract(CR.ONE);
    return a;
  }
}
