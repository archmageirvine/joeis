package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081708 a(n) = a(n-1) + 64*a(n-2) starting with a(0) = 2 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A081708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081708() {
    super(new long[] {64, 1}, new long[] {2, 1});
  }
}
