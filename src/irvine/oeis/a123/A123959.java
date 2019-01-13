package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123959.
 * @author Sean A. Irvine
 */
public class A123959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123959() {
    super(new long[] {-8, -8, 8, 4, 0}, new long[] {1, 0, 4, 8, 8});
  }
}
