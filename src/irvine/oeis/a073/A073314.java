package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073314.
 * @author Sean A. Irvine
 */
public class A073314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073314() {
    super(new long[] {-2, 0, 2}, new long[] {3, 2, 4});
  }
}
