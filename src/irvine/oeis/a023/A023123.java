package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023123 Signature sequence of e (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023123 extends A023117 {

  @Override
  protected CR getN() {
    return CR.E;
  }
}
