package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031853 Period of continued fraction for sqrt(n) contains exactly 85 ones.
 * @author Sean A. Irvine
 */
public class A031853 extends A013648 {

  @Override
  protected int targetOnes() {
    return 85;
  }
}
