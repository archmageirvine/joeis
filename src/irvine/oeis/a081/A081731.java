package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;

/**
 * A081731 a(n) = (A000364(n+2)-A000364(n))/60.
 * @author Sean A. Irvine
 */
public class A081731 extends Sequence1 {

  private final Sequence mEuler = new A000364().skip();
  private Z mA = mEuler.next();
  private Z mB = mEuler.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = mEuler.next();
    return mB.subtract(t).divide(60);
  }
}
