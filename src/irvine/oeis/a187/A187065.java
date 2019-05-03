package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187065 Let i be in <code>{1,2,3}</code> and let r <code>&gt;= 0</code> be an integer. Let p <code>= {p_1, p_2, p_3} = {-2,0,1}, n=2*r+p_i</code>, and define <code>a(-2)=1</code>. Then, <code>a(n)=a(2*r+p_i)</code> gives the quantity of <code>H_(7,1,0)</code> tiles in a subdivided <code>H_(7,i,r)</code> tile after linear scaling by the factor <code>x^r</code>, where <code>x=sqrt(2*cos(Pi/7))</code>.
 * @author Sean A. Irvine
 */
public class A187065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187065() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 1, 0, 0, 1});
  }
}
