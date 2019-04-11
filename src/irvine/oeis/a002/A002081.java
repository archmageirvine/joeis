package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000689;

/**
 * A002081 Numbers congruent to <code>{2, 4, 8, 16} mod 20</code>.
 * @author Sean A. Irvine
 */
public class A002081 extends A000689 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.add(super.next());
    return mA;
  }
}
