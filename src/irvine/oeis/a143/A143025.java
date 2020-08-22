package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143025 Period length 4: repeat [1, 8, 2, 8].
 * @author Sean A. Irvine
 */
public class A143025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143025() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 8, 2, 8});
  }
}
