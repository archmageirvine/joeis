package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125128 <code>a(n) = 2^(n+1) - n - 2</code>, or partial sums of main diagonal of array <code>A125127</code> of k-step Lucas numbers.
 * @author Sean A. Irvine
 */
public class A125128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125128() {
    super(new long[] {2, -5, 4}, new long[] {1, 4, 11});
  }
}
