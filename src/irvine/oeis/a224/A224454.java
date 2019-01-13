package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224454.
 * @author Sean A. Irvine
 */
public class A224454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224454() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 180, 567, 1296});
  }
}
