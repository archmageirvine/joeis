package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154127 Period <code>6</code>: repeat <code>[1, 2, 5, 8, 7, 4]</code>.
 * @author Sean A. Irvine
 */
public class A154127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154127() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 2, 5, 8});
  }
}
