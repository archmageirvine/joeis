package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187506 Let i be in <code>{1,2,3,4}</code> and let r <code>&gt;= 0</code> be an integer. Let p <code>= {p_1, p_2, p_3, p_4} = {-1,0,1,2}, n=3*r+p_i</code>, and define <code>a(-1)=0</code>. Then <code>a(n)=a(3*r+p_i)</code> gives the quantity of <code>H_(9,4,0)</code> tiles in a subdivided <code>H_(9,i,r)</code> tile after linear scaling by the factor <code>Q^r</code>, where <code>Q=sqrt(x^3-2*x)</code> with <code>x=2*cos(Pi/9)</code>.
 * @author Sean A. Irvine
 */
public class A187506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187506() {
    super(new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {0, 0, 1, 1, 1, 1, 2, 3, 4, 7, 9});
  }
}
