package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192909 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192909() {
    super(new long[] {-1, 0, 1, -3, 4}, new long[] {1, 1, 3, 9, 27});
  }
}
