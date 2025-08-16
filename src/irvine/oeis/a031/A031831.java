package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031831 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 63 ones.
 * @author Sean A. Irvine
 */
public class A031831 extends A013648 {

  @Override
  protected int targetOnes() {
    return 63;
  }
}
