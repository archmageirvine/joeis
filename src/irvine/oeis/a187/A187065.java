package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187065 Let i be in {1,2,3} and let r &gt;= 0 be an integer. Let p = {p_1, p_2, p_3} = {-2,0,1}, n=2*r+p_i, and define a(-2)=1. Then, a(n)=a(2*r+p_i) gives the quantity of H_(7,1,0) tiles in a subdivided H_(7,i,r) tile after linear scaling by the factor x^r, where x=sqrt(2*cos(Pi/7)).
 * @author Sean A. Irvine
 */
public class A187065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187065() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 1, 0, 0, 1});
  }
}
