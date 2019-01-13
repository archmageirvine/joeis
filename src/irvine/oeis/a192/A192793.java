package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192793.
 * @author Sean A. Irvine
 */
public class A192793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192793() {
    super(new long[] {-1, 4, -6, 4}, new long[] {108, 360, 900, 1872});
  }
}
