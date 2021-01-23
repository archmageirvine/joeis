package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195615 Numerators b(n) of Pythagorean approximations b(n)/a(n) to 2.
 * @author Sean A. Irvine
 */
public class A195615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195615() {
    super(new long[] {-1, 17, 17}, new long[] {15, 273, 4895});
  }
}
