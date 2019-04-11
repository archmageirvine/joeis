package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166931 Numbers n with property that <code>n mod k</code> is <code>k-1</code> for all <code>k = 2..9</code>.
 * @author Sean A. Irvine
 */
public class A166931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166931() {
    super(new long[] {-1, 2}, new long[] {2519, 5039});
  }
}
