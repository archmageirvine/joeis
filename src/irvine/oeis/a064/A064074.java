package irvine.oeis.a064;

import irvine.oeis.a000.A000061;

/**
 * A064074 Generalized tangent number d(9,n).
 * @author Sean A. Irvine
 */
public class A064074 extends A000061 {

  @Override
  protected int getA() {
    return 9;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
