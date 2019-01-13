package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214393.
 * @author Sean A. Irvine
 */
public class A214393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214393() {
    super(new long[] {1, -2, 0, 2}, new long[] {13, 17, 53, 73});
  }
}
