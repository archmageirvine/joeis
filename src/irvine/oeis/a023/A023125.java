package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023125.
 * @author Sean A. Irvine
 */
public class A023125 extends A023117 {

  private static final CR N = CR.E.multiply(CR.E);

  @Override
  protected CR getN() {
    return N;
  }
}
