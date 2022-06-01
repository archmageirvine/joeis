package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164595 a(n) = 10*a(n-1) - 17*a(n-2) for n &gt; 1; a(0) = 5, a(1) = 37.
 * @author Sean A. Irvine
 */
public class A164595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164595() {
    super(new long[] {-17, 10}, new long[] {5, 37});
  }
}
