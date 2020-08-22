package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166916 a(n) = 20*a(n-1) - 64*a(n-2) - 15 for n &gt; 1; a(0) = 357, a(1) = 5525.
 * @author Sean A. Irvine
 */
public class A166916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166916() {
    super(new long[] {64, -84, 21}, new long[] {357, 5525, 87637});
  }
}
