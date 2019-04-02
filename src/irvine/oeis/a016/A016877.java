package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016877 (5n+2)^5.
 * @author Sean A. Irvine
 */
public class A016877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016877() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 16807, 248832, 1419857, 5153632, 14348907});
  }
}
