package irvine.oeis.a064;

import irvine.oeis.a000.A000061;

/**
 * A064075 Generalized tangent number <code>d(10,n)</code>.
 * @author Sean A. Irvine
 */
public class A064075 extends A000061 {

  @Override
  protected int getA() {
    return 10;
  }

  @Override
  protected int getN() {
    return ++mT;
  }
}
