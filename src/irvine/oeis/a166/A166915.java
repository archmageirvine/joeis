package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166915 a(n) = 20*a(n-1) - 64*a(n-2) - 45 for n&gt;1; a(0) = 399, a(1) = 5695.
 * @author Sean A. Irvine
 */
public class A166915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166915() {
    super(new long[] {64, -84, 21}, new long[] {399, 5695, 88319});
  }
}
