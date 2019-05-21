package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023128.
 * @author Sean A. Irvine
 */
public class A023128 extends A023117 {

  private static final CR N = CR.valueOf(6).sqrt().inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
