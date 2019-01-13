package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192832.
 * @author Sean A. Irvine
 */
public class A192832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192832() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 48, 576, 2880, 9600, 25200});
  }
}
