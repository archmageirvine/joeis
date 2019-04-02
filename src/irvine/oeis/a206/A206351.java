package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206351 a(n) = 7*a(n-1) - a(n-2) - 4 with a(1)=1, a(2)=3.
 * @author Sean A. Irvine
 */
public class A206351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206351() {
    super(new long[] {1, -8, 8}, new long[] {1, 3, 16});
  }
}
