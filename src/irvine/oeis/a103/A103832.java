package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103832 For even n, a(n)=2n+1, for odd n, a(n)=n(n+1).
 * @author Sean A. Irvine
 */
public class A103832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103832() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 2, 5, 12, 9, 30});
  }
}
