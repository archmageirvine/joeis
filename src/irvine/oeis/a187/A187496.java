package irvine.oeis.a187;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A187496 Let i be in {1,2,3,4} and let r &gt;= 0 be an integer. Let p = {p_1, p_2, p_3, p_4} = {-3,0,1,2}, n=3*r+p_i, and define a(-3)=0. Then a(n)=a(3*r+p_i) gives the quantity of H_(9,2,0) tiles in a subdivided H_(9,i,r) tile after linear scaling by the factor Q^r, where Q=sqrt(2*cos(Pi/9)). 
 * @author Georg Fischer
 */
public class A187496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187496() {
    super(new long[] {-1L, 0L, 0L, -2L, 0L, 0L, 3L, 0L, 0L, 1L, 0L, 0L}, new long[] {1L, 0L, 0L, 0L, 1L, 0L, 2L, 0L, 1L, 0L, 3L, 1L});
  } // constructor()
} // A187496
