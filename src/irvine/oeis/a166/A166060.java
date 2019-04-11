package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166060 <code>4*3^n - 3*2^n</code>.
 * @author Sean A. Irvine
 */
public class A166060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166060() {
    super(new long[] {-6, 5}, new long[] {1, 6});
  }
}
