package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261728 <code>a(1)=1; a(2*n) = 3*n</code>; for odd <code>n&gt;1, a(n)</code> is the smallest number not already present which is entailed by the rules <code>(i)</code> k present <code>=&gt; 3*k+1</code> present; (ii) <code>2*k</code> present <code>=&gt</code>; k present.
 * @author Sean A. Irvine
 */
public class A261728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261728() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 6, 2, 9, 7, 12, 10, 15, 5, 18});
  }
}
