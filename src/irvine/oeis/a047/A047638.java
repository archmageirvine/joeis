package irvine.oeis.a047;

import irvine.oeis.a001.A001482;

/**
 * A047638 Expansion of (Product_{j&gt;=1} (1-(-x)^j) - 1)^13 in powers of x.
 * @author Sean A. Irvine
 */
public class A047638 extends A001482 {

  @Override
  protected int power() {
    return 13;
  }
}
