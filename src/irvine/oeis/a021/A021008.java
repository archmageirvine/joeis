package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021008 Pisot sequence P(5,11), a(0)=5, a(1)=11, a(n+1) is the nearest integer to a(n)^2/a(n-1).
 * @author Sean A. Irvine
 */
public class A021008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021008() {
    super(new long[] {1, 0, -2, 3}, new long[] {5, 11, 24, 52});
  }
}
