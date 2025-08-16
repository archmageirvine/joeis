package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020446 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly ten 1's.
 * @author Sean A. Irvine
 */
public class A020446 extends A013648 {

  @Override
  protected int targetOnes() {
    return 10;
  }
}
