package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132458 Let <code>df(n,k) = Product_{i=0..k-1} (n-i)</code> be the descending factorial and let P(m,n) <code>= df(n-1</code>,m-1)^2*(2*n-m)/((m-1)!*m!). Sequence gives <code>P(4,n)</code>.
 * @author Sean A. Irvine
 */
public class A132458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132458() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 0, 1, 24, 200, 1000, 3675});
  }
}
