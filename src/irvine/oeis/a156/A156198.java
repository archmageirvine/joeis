package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156198.
 * @author Sean A. Irvine
 */
public class A156198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156198() {
    super(new long[] {-2, 3}, new long[] {8, 19});
  }
}
