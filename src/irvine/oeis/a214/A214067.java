package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214067 [(5/2)*[(5/2)*n]], where [ ] = floor.
 * @author Sean A. Irvine
 */
public class A214067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214067() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 5, 12, 17, 25});
  }
}
