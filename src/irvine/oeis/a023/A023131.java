package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023131.
 * @author Sean A. Irvine
 */
public class A023131 extends A023117 {

  private static final CR N = CR.valueOf(8).sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
