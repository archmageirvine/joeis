package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020440 Period of continued fraction for sqrt(n) contains exactly four 1's.
 * @author Sean A. Irvine
 */
public class A020440 extends A013648 {

  @Override
  protected int targetOnes() {
    return 4;
  }
}
