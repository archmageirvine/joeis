package irvine.oeis.a023;

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A023121 Signature sequence of sqrt(2/3) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023121 extends A023117 {

  private static final CR N = CR.valueOf(new Q(2, 3)).sqrt();

  @Override
  protected CR getN() {
    return N;
  }
}
