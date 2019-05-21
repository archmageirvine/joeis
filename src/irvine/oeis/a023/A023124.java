package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023124.
 * @author Sean A. Irvine
 */
public class A023124 extends A023117 {

  private static final CR N = CR.E.inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
