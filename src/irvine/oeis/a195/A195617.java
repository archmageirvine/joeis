package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195617 Numerators b(n) of Pythagorean approximations b(n)/a(n) to 3.
 * @author Sean A. Irvine
 */
public class A195617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195617() {
    super(new long[] {-1, 37, 37}, new long[] {35, 1333, 50615});
  }
}
