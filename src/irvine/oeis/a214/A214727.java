package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214727.
 * @author Sean A. Irvine
 */
public class A214727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214727() {
    super(new long[] {1, 1, 1}, new long[] {1, 2, 2});
  }
}
