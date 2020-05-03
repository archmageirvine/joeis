package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031826 Period of continued fraction for <code>sqrt(n)</code> contains exactly 58 ones.
 * @author Sean A. Irvine
 */
public class A031826 extends A013648 {

  @Override
  protected int targetOnes() {
    return 58;
  }
}
