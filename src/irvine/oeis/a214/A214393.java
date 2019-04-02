package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214393 Numbers of the form (4k+3)^2+4 or (4k+5)^2-8.
 * @author Sean A. Irvine
 */
public class A214393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214393() {
    super(new long[] {1, -2, 0, 2}, new long[] {13, 17, 53, 73});
  }
}
