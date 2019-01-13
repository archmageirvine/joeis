package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130659.
 * @author Sean A. Irvine
 */
public class A130659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130659() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 2, 4});
  }
}
