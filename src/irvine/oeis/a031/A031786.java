package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031786 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 18 ones.
 * @author Sean A. Irvine
 */
public class A031786 extends A013648 {

  @Override
  protected int targetOnes() {
    return 18;
  }
}
