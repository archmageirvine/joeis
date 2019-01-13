package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087330.
 * @author Sean A. Irvine
 */
public class A087330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087330() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 15, 370, 6150});
  }
}
