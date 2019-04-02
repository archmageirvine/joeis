package irvine.oeis.a064;

import irvine.oeis.a000.A000061;

/**
 * A064072 Generalized tangent number d(7,n).
 * @author Sean A. Irvine
 */
public class A064072 extends A000061 {

  @Override
  protected int getA() {
    return 7;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
