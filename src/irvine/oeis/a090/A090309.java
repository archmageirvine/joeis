package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090309 a(n) = 20a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 20.
 * @author Sean A. Irvine
 */
public class A090309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090309() {
    super(new long[] {1, 20}, new long[] {2, 20});
  }
}
