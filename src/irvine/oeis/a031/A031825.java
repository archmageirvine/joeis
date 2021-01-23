package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031825 Period of continued fraction for sqrt(n) contains exactly 57 ones.
 * @author Sean A. Irvine
 */
public class A031825 extends A013648 {

  @Override
  protected int targetOnes() {
    return 57;
  }
}
