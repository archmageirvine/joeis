package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145124.
 * @author Sean A. Irvine
 */
public class A145124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145124() {
    super(new long[] {1, -303, 303}, new long[] {2, 757, 228762});
  }
}
