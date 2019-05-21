package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023130.
 * @author Sean A. Irvine
 */
public class A023130 extends A023117 {

  private static final CR N = CR.E.sqrt().inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
