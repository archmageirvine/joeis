package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024090.
 * @author Sean A. Irvine
 */
public class A024090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024090() {
    super(new long[] {-8, 25, -27, 11}, new long[] {1, 7, 60, 503});
  }
}
