package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083332 a(n) = 10*a(n-2) - 16*a(n-4) for n &gt; 3, a(0) = 1, a(1) = 5, a(2) = 14, a(3) = 34.
 * @author Sean A. Irvine
 */
public class A083332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083332() {
    super(new long[] {-16, 0, 10, 0}, new long[] {1, 5, 14, 34});
  }
}
