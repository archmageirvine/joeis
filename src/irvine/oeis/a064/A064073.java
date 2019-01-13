package irvine.oeis.a064;

import irvine.oeis.a000.A000061;

/**
 * A064073.
 * @author Sean A. Irvine
 */
public class A064073 extends A000061 {

  @Override
  protected int getA() {
    return 8;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
