package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195616 Denominators a(n) of Pythagorean approximations b(n)/a(n) to 3.
 * @author Sean A. Irvine
 */
public class A195616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195616() {
    super(new long[] {-1, 37, 37}, new long[] {12, 444, 16872});
  }
}
