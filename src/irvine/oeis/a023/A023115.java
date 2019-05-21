package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023115 Signature sequence of <code>1/sqrt(2)</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A023115 extends A023117 {

  private static final CR N = CR.SQRT2.inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
