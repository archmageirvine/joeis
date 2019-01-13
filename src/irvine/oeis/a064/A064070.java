package irvine.oeis.a064;

import irvine.oeis.a000.A000233;

/**
 * A064070.
 * @author Sean A. Irvine
 */
public class A064070 extends A000233 {

  @Override
  protected int getA() {
    return 9;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
