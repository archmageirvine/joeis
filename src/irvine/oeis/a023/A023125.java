package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023125 Signature sequence of <code>e^2</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A023125 extends A023117 {

  private static final CR N = CR.E.multiply(CR.E);

  @Override
  protected CR getN() {
    return N;
  }
}
