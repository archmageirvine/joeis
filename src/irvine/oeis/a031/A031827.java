package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031827 Period of continued fraction for sqrt(n) contains exactly 59 ones.
 * @author Sean A. Irvine
 */
public class A031827 extends A013648 {

  @Override
  protected int targetOnes() {
    return 59;
  }
}
