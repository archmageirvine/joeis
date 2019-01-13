package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138134.
 * @author Sean A. Irvine
 */
public class A138134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138134() {
    super(new long[] {-1, -10, 12}, new long[] {0, 5, 60});
  }
}
