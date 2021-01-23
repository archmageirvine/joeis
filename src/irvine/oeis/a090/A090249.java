package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090249 a(n) = 28a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 28.
 * @author Sean A. Irvine
 */
public class A090249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090249() {
    super(new long[] {-1, 28}, new long[] {2, 28});
  }
}
