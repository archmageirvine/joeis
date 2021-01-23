package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020441 Period of continued fraction for sqrt(n) contains exactly five 1's.
 * @author Sean A. Irvine
 */
public class A020441 extends A013648 {

  @Override
  protected int targetOnes() {
    return 5;
  }
}
