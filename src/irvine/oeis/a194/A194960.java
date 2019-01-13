package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194960.
 * @author Sean A. Irvine
 */
public class A194960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194960() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 2});
  }
}
