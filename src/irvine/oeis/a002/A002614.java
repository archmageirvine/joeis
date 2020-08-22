package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a321.A321546;

/**
 * A002614 Glaisher's function theta(n) (18 squares version).
 * @author Sean A. Irvine
 */
public class A002614 extends A321546 {

  private final Sequence mA = new A002288();
  {
    mA.next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).divide(17);
  }
}
