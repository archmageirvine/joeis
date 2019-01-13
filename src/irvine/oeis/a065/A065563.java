package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065563.
 * @author Sean A. Irvine
 */
public class A065563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065563() {
    super(new long[] {-1, -3, 6, 3}, new long[] {2, 6, 30, 120});
  }
}
