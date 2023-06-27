package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261728 a(1)=1; a(2*n) = 3*n; for odd n&gt;1, a(n) is the smallest number not already present which is entailed by the rules (i) k present =&gt; 3*k+1 present; (ii) 2*k present =&gt; k present.
 * @author Sean A. Irvine
 */
public class A261728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261728() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 6, 2, 9, 7, 12, 10, 15, 5, 18});
  }
}
