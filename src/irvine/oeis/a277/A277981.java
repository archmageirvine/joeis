package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277981.
 * @author Sean A. Irvine
 */
public class A277981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277981() {
    super(new long[] {1, -3, 3}, new long[] {-20, 2, 32});
  }
}
