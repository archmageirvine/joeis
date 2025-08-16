package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020441 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly five 1's.
 * @author Sean A. Irvine
 */
public class A020441 extends A013648 {

  @Override
  protected int targetOnes() {
    return 5;
  }
}
