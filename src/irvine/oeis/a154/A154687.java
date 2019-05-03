package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154687 Period <code>6</code>: repeat <code>[1, 4, 7, 8, 5, 2]</code>.
 * @author Sean A. Irvine
 */
public class A154687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154687() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 7, 8});
  }
}
