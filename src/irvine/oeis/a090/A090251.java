package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090251 a(n) =29a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 29.
 * @author Sean A. Irvine
 */
public class A090251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090251() {
    super(new long[] {-1, 29}, new long[] {2, 29});
  }
}
