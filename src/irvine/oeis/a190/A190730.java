package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190730 Let b(n,0)=n and b(n,k)=2*b(n,k-1) <code>+ 1</code> for k <code>&gt; 0</code>. Then <code>a(n) =</code> b(n,1) + b(n,2) <code>+ </code>... + b(n,n).
 * @author Sean A. Irvine
 */
public class A190730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190730() {
    super(new long[] {-4, 12, -13, 6}, new long[] {3, 16, 53, 146});
  }
}
