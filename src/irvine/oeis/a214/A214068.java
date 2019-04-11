package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214068 <code>a(n) = floor((3/2)*floor((3/2)*n))</code>.
 * @author Sean A. Irvine
 */
public class A214068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214068() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 6, 9});
  }
}
