package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023130 Signature sequence of 1/sqrt(e) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023130 extends A023117 {

  private static final CR N = CR.E.sqrt().inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
