package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134241.
 * @author Sean A. Irvine
 */
public class A134241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134241() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 384, 4800, 25920});
  }
}
