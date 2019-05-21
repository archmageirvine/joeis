package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023127.
 * @author Sean A. Irvine
 */
public class A023127 extends A023117 {

  private static final CR N = CR.valueOf(6).sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
