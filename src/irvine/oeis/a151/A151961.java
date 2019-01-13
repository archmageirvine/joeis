package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151961.
 * @author Sean A. Irvine
 */
public class A151961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151961() {
    super(new long[] {-1, 4}, new long[] {3, 6});
  }
}
