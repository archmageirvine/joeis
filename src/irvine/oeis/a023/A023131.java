package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023131 Signature sequence of sqrt(8) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023131 extends A023117 {

  private static final CR N = CR.EIGHT.sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
