package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187070 Let i be in {1,2,3}, let r &gt;= 0 be an integer and n=2*r+i-1. Then a(n)=a(2*r+i-1) gives the quantity of H_(7,3,0) tiles in a subdivided H_(7,i,r) tile after linear scaling by the factor x^r, where x=sqrt((2*cos(Pi/7))^2-1).
 * @author Sean A. Irvine
 */
public class A187070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187070() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {0, 0, 1, 1, 1, 2});
  }
}
