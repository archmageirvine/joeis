package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190730 Let <code>b(n,0)=n</code> and <code>b(n,k)=2*b(n,k-1) + 1</code> for <code>k &gt; 0. </code> Then <code>a(n) = b(n,1) + b(n,2) + ... + b(n,n)</code>.
 * @author Sean A. Irvine
 */
public class A190730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190730() {
    super(new long[] {-4, 12, -13, 6}, new long[] {3, 16, 53, 146});
  }
}
