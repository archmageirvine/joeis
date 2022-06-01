package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166060 a(n) = 4*3^n - 3*2^n.
 * @author Sean A. Irvine
 */
public class A166060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166060() {
    super(new long[] {-6, 5}, new long[] {1, 6});
  }
}
