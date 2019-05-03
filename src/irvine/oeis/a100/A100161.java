package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100161 Structured disdyakis dodecahedral numbers (vertex structure <code>9)</code>.
 * @author Sean A. Irvine
 */
public class A100161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100161() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 26, 115, 308});
  }
}
