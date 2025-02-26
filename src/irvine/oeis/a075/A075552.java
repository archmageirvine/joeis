package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a073.A073628;

/**
 * A075533.
 * @author Sean A. Irvine
 */
public class A075552 extends A073628 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.add(mA).add(t);
  }
}

