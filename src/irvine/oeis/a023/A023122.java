package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A023122 Signature sequence of <code>sqrt(3/2)</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A023122 extends A023117 {

  private static final CR N = CR.valueOf(new Q(3, 2)).sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
