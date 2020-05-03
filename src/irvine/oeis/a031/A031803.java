package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031803 Period of continued fraction for <code>sqrt(n)</code> contains exactly 35 ones.
 * @author Sean A. Irvine
 */
public class A031803 extends A013648 {

  @Override
  protected int targetOnes() {
    return 35;
  }
}
