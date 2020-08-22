package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090729 a(n) = 21a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 21.
 * @author Sean A. Irvine
 */
public class A090729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090729() {
    super(new long[] {-1, 21}, new long[] {2, 21});
  }
}
