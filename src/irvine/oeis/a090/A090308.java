package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090308 a(n) = 19a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 19.
 * @author Sean A. Irvine
 */
public class A090308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090308() {
    super(new long[] {1, 19}, new long[] {2, 19});
  }
}
