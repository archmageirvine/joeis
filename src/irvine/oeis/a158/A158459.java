package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158459 Period <code>4</code>: repeat <code>[0, 3, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A158459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158459() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 3, 2, 1});
  }
}
