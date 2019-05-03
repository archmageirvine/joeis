package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167779 Subsequence of <code>A167708</code> whose indices are congruent to <code>4 mod 5</code>, i.e., <code>a(n) = A167708(5n+4)</code>.
 * @author Sean A. Irvine
 */
public class A167779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167779() {
    super(new long[] {-1, 340}, new long[] {105, 35634});
  }
}
