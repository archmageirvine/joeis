package irvine.oeis.a064;

import irvine.oeis.a000.A000233;

/**
 * A064071 Generalized Euler number <code>c(10,n)</code>.
 * @author Sean A. Irvine
 */
public class A064071 extends A000233 {

  @Override
  protected int getA() {
    return 10;
  }

  @Override
  protected int getN() {
    return mT++;
  }
}
