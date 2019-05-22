package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023133 Signature sequence of <code>Pi</code> (arrange the numbers <code>i+j*x (i,j &gt;= 1)</code> in increasing order; the sequence of i's is the signature of <code>x)</code>.
 * @author Sean A. Irvine
 */
public class A023133 extends A023117 {

  @Override
  protected CR getN() {
    return CR.PI;
  }
}
