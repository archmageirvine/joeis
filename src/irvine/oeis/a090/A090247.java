package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090247.
 * @author Sean A. Irvine
 */
public class A090247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090247() {
    super(new long[] {-1, 26}, new long[] {2, 26});
  }
}
