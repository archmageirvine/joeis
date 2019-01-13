package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192802.
 * @author Sean A. Irvine
 */
public class A192802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192802() {
    super(new long[] {11, -15, 7}, new long[] {0, 1, 4});
  }
}
