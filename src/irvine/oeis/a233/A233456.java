package irvine.oeis.a233;

import irvine.oeis.a052.A052210;

/**
 * A233456 Numbers k such that k^10 starts with k itself (in base 10).
 * @author Sean A. Irvine
 */
public class A233456 extends A052210 {

  @Override
  protected int power() {
    return 10;
  }
}
