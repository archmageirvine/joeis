package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230074 Period <code>4</code>: repeat <code>[1, -2, 1, 0]</code>.
 * @author Sean A. Irvine
 */
public class A230074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230074() {
    super(new long[] {-1, -1, -1}, new long[] {1, -2, 1});
  }
}
