package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002969;

/**
 * A029585 E.g.f. 1/(1+sin(x)+sin(x)^2).
 * @author Sean A. Irvine
 */
public class A029585 extends A002969 {

  private boolean mSign = false;

  @Override
  public Z next() {
    mSign = !mSign;
    return mSign ? super.next() : super.next().negate();
  }
}
