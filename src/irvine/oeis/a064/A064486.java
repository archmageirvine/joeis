package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a003.A003285;

/**
 * A064486 Period of continued fraction for square roots of primorials.
 * @author Sean A. Irvine
 */
public class A064486 extends A003285 {

  private final Sequence mPrimorial = new A002110().skip();

  @Override
  public Z next() {
    return period(mPrimorial.next());
  }
}
