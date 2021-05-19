package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047755 a(n) = A047752(12n+5).
 * @author Sean A. Irvine
 */
public class A047755 extends A047749 {

  private final Sequence mA = new A001764();

  @Override
  public Z next() {
    return mA.next().subtract(super.next()).divide2();
  }
}

