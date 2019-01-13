package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151675.
 * @author Sean A. Irvine
 */
public class A151675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151675() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 27, 63, 122});
  }
}
