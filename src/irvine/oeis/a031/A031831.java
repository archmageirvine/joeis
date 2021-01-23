package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031831 Period of continued fraction for sqrt(n) contains exactly 63 ones.
 * @author Sean A. Irvine
 */
public class A031831 extends A013648 {

  @Override
  protected int targetOnes() {
    return 63;
  }
}
