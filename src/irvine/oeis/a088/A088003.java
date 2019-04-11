package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088003 Take the list t(n,0) <code>= {1,...,n}</code>; denote by t(n,j) this list after rotating to left (or right) by j positions. Calculate inner product of t(n,0) and t(n,j) and denote the value by s(n,j). Compute this inner product for all <code>j = 1..n</code> and choose the smallest. This is <code>a(n)</code>.
 * @author Sean A. Irvine
 */
public class A088003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088003() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 4, 11, 22, 40, 64});
  }
}
