package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007212 Oscillates under partition transform.
 * @author Sean A. Irvine
 */
public class A007212 extends A007210 {

  @Override
  protected void init() {
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.TWO);
    mA.add(Z.FOUR);
  }
}

