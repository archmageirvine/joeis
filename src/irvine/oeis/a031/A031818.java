package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031818 Period of continued fraction for <code>sqrt(n)</code> contains exactly 50 ones.
 * @author Sean A. Irvine
 */
public class A031818 extends A013648 {

  @Override
  protected int targetOnes() {
    return 50;
  }
}
