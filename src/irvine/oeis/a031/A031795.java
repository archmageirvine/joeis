package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031795 Period of continued fraction for sqrt(n) contains exactly 27 ones.
 * @author Sean A. Irvine
 */
public class A031795 extends A013648 {

  @Override
  protected int targetOnes() {
    return 27;
  }
}
