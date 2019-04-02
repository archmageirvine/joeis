package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203410 Indices of decagonal numbers that are also heptagonal.
 * @author Sean A. Irvine
 */
public class A203410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203410() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 12, 850, 16761, 1225159});
  }
}
