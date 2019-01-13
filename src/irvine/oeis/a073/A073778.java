package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073778.
 * @author Sean A. Irvine
 */
public class A073778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073778() {
    super(new long[] {-1, -2, -3, 0, 1, 2}, new long[] {0, 0, 1, 2, 5, 12});
  }
}
