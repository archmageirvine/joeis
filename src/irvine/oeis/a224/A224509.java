package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224509.
 * @author Sean A. Irvine
 */
public class A224509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224509() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 3, 10, 35, 125});
  }
}
