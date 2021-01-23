package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020443 Period of continued fraction for sqrt(n) contains exactly seven 1's.
 * @author Sean A. Irvine
 */
public class A020443 extends A013648 {

  @Override
  protected int targetOnes() {
    return 7;
  }
}
