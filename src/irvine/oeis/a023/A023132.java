package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023132.
 * @author Sean A. Irvine
 */
public class A023132 extends A023117 {

  private static final CR N = CR.valueOf(8).sqrt().inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
