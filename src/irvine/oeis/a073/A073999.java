package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073999.
 * @author Sean A. Irvine
 */
public class A073999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073999() {
    super(new long[] {-32, 24, -12, 6}, new long[] {0, 0, 3, 16});
  }
}
