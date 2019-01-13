package irvine.oeis.a064;

import irvine.oeis.a000.A000233;

/**
 * A064068.
 * @author Sean A. Irvine
 */
public class A064068 extends A000233 {

  @Override
  protected int getA() {
    return 7;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
