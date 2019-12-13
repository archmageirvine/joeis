package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027959 <code>a(n) = Sum_{k=m..n} T(k,n-k)</code>, where m <code>= floor((n+1)/2); a(n)</code> is the <code>n-th diagonal-sum</code> of left justified array T given by <code>A027948</code>.
 * @author Sean A. Irvine
 */
public class A027959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027959() {
    super(new long[] {1, -1, -3, 1, 3, 0}, new long[] {1, 2, 3, 5, 7, 12}, 1);
  }
}
