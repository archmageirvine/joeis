package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189318.
 * @author Sean A. Irvine
 */
public class A189318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189318() {
    super(new long[] {-4, 2, 3}, new long[] {5, 5, 25});
  }
}
