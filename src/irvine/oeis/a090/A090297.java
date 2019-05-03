package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090297 <code>a(n) = K_5(n) = Sum_{k&gt;=0} A090285(5,k)*2^k*binomial(n,k). a(n) = 2*(2*n^5+45*n^4+360*n^3+1215*n^2+1528*n+315)/15</code>.
 * @author Sean A. Irvine
 */
public class A090297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090297() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {42, 462, 1586, 3958, 8330, 15694});
  }
}
