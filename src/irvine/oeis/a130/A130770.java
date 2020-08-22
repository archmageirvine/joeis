package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130770 One third of the least common multiple of 3 and n^2+n+1.
 * @author Sean A. Irvine
 */
public class A130770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130770() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 1, 7, 13, 7, 31, 43, 19, 73});
  }
}
