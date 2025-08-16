package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031835 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 67 ones.
 * @author Sean A. Irvine
 */
public class A031835 extends A013648 {

  @Override
  protected int targetOnes() {
    return 67;
  }
}
