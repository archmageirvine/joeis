package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202563.
 * @author Sean A. Irvine
 */
public class A202563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202563() {
    super(new long[] {1, -9603, 9603}, new long[] {1, 12376, 118837251});
  }
}
