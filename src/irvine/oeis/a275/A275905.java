package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275905.
 * @author Sean A. Irvine
 */
public class A275905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275905() {
    super(new long[] {2, -3, 6}, new long[] {1, 5, 25});
  }
}
