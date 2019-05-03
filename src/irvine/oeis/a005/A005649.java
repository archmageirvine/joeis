package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A005649 Expansion of e.g.f. <code>(2 - e^x)^(-2)</code>.
 * @author Sean A. Irvine
 */
public class A005649 extends A000670 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA).divide2();
  }
}

