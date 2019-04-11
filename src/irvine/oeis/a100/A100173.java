package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100173 Structured pentakis dodecahedral numbers (vertex structure <code>6)</code>.
 * @author Sean A. Irvine
 */
public class A100173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100173() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 32, 148, 404});
  }
}
