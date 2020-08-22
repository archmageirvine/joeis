package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031779 Period of continued fraction for sqrt(n) contains exactly 11 ones.
 * @author Sean A. Irvine
 */
public class A031779 extends A013648 {

  @Override
  protected int targetOnes() {
    return 11;
  }
}
