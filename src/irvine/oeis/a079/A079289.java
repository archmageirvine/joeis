package irvine.oeis.a079;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079289 For even n, a(n) = a(n-2) + a(n-1) + 2^(n/2-2), n&gt;2. For odd n, a(n) = a(n-2) + a(n-1).
 * @author Georg Fischer
 */
public class A079289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079289() {
    super(new long[] {-2, -2, 3, 1}, new long[] {1, 2, 3, 6}, 1);
  }
}
