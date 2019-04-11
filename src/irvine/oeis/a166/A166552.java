package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166552 <code>a(n) = 3*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 1</code>; <code>a(2) = 4</code>.
 * @author Sean A. Irvine
 */
public class A166552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166552() {
    super(new long[] {3, 0}, new long[] {1, 4});
  }
}
