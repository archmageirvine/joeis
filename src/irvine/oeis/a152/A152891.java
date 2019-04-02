package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152891 a(1)=b(1)=0; for n &gt; 1, b(n) = b(n-1) + n-1 + a(n-1); a(n) = a(n-1) + n-1 + b(n).
 * @author Sean A. Irvine
 */
public class A152891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152891() {
    super(new long[] {-1, 5, -8, 5}, new long[] {0, 2, 9, 29});
  }
}
