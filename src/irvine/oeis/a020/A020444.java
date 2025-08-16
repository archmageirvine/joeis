package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020444 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly eight 1's.
 * @author Sean A. Irvine
 */
public class A020444 extends A013648 {

  @Override
  protected int targetOnes() {
    return 8;
  }
}
