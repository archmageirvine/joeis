package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081901.
 * @author Sean A. Irvine
 */
public class A081901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081901() {
    super(new long[] {-729, 1458, -1215, 540, -135, 18}, new long[] {1, 8, 49, 262, 1286, 5944});
  }
}
