package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123960.
 * @author Sean A. Irvine
 */
public class A123960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123960() {
    super(new long[] {-49, 80, -45, 11}, new long[] {0, 0, 0, 2});
  }
}
