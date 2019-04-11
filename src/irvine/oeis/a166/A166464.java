package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166464 <code>a(n) = (3+2n+6n^2+4n^3)/3</code>.
 * @author Sean A. Irvine
 */
public class A166464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166464() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 21, 57});
  }
}
