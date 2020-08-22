package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072264 a(n) = 3*a(n-1) + 5*a(n-2), with a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A072264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072264() {
    super(new long[] {5, 3}, new long[] {1, 1});
  }
}
