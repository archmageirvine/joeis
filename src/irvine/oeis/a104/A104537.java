package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104537.
 * @author Sean A. Irvine
 */
public class A104537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104537() {
    super(new long[] {-4, -2}, new long[] {1, -1});
  }
}
