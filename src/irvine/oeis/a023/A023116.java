package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023116 Signature sequence of 1/sqrt(3) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023116 extends A023117 {

  private static final CR N = CR.THREE.sqrt().inverse();

  @Override
  protected CR getN() {
    return N;
  }
}
