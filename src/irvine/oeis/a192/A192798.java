package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192798.
 * @author Sean A. Irvine
 */
public class A192798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192798() {
    super(new long[] {1, 1, -3, 0, 3, 1}, new long[] {1, 0, 1, 2, 3, 10});
  }
}
