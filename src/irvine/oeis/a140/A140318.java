package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140318.
 * @author Sean A. Irvine
 */
public class A140318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140318() {
    super(new long[] {-1, 0, 0, 1, 0, 0}, new long[] {0, 1, -1, 1, 0, -1});
  }
}
