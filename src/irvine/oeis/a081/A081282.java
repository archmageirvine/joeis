package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081282 Generalized centered polygonal numbers.
 * @author Sean A. Irvine
 */
public class A081282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081282() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 6, 22, 62, 147});
  }
}
