package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199215 4*5^n+1.
 * @author Sean A. Irvine
 */
public class A199215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199215() {
    super(new long[] {-5, 6}, new long[] {5, 21});
  }
}
