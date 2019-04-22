package irvine.oeis.a020;

import irvine.oeis.a013.A013648;

/**
 * A020442 Period of continued fraction for <code>sqrt(n)</code> contains exactly six 1's.
 * @author Sean A. Irvine
 */
public class A020442 extends A013648 {

  @Override
  protected int targetOnes() {
    return 6;
  }
}
