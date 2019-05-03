package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110568 Period <code>6</code>: repeat <code>[1, 0, 2, 2, 0, 1]</code>.
 * @author Sean A. Irvine
 */
public class A110568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110568() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 0, 2, 2, 0});
  }
}
