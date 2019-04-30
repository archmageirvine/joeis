package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187066 Let i be in <code>{1,2,3}</code> and let r <code>&gt;= 0</code> be an integer. Let p = {p_1, p_2, p_3} <code>= {-2,0,1}</code>, n=2*r+p_i, and define <code>a(-2)=0</code>. Then, a(n)=a(2*r+p_i) gives the quantity of H_(7,2,0) tiles in a subdivided H_(7,i,r) tile after linear scaling by the factor x^r, where x=sqrt(2*cos(Pi/7)).
 * @author Sean A. Irvine
 */
public class A187066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187066() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {1, 0, 0, 1, 2, 1});
  }
}
