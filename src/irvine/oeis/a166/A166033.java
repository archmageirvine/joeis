package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166033 <code>a(n) = 11/4 +11*n/2 + 29*(-1)^n/4</code>.
 * @author Sean A. Irvine
 */
public class A166033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166033() {
    super(new long[] {-1, 1, 1}, new long[] {1, 21, 12});
  }
}
