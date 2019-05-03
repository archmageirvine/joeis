package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143025 Period length <code>4</code>: repeat <code>[1, 8, 2, 8]</code>.
 * @author Sean A. Irvine
 */
public class A143025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143025() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 8, 2, 8});
  }
}
