package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084130.
 * @author Sean A. Irvine
 */
public class A084130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084130() {
    super(new long[] {-8, 8}, new long[] {1, 4});
  }
}
