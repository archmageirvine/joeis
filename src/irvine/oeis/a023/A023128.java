package irvine.oeis.a023;

import irvine.math.cr.CR;

/**
 * A023128 Signature sequence of 1/sqrt(6) (arrange the numbers i+j*x (i,j &gt;= 1) in increasing order; the sequence of i's is the signature of x).
 * @author Sean A. Irvine
 */
public class A023128 extends A023117 {

  /** Construct the sequence. */
  public A023128() {
    super(CR.SIX.sqrt().inverse());
  }
}
