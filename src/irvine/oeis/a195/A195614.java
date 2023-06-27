package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195614 Denominators a(n) of Pythagorean approximations b(n)/a(n) to 2.
 * @author Sean A. Irvine
 */
public class A195614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195614() {
    super(1, new long[] {-1, 17, 17}, new long[] {8, 136, 2448});
  }
}
