package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242300 <code>a(n) =</code> Sum_{0&lt;=i&lt;j&lt;=n}L(i)*L(j), where L(k)=A000032(k) is the k-th Lucas number.
 * @author Sean A. Irvine
 */
public class A242300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242300() {
    super(new long[] {-1, 2, 4, -6, -2, 4}, new long[] {0, 2, 11, 35, 105, 292});
  }
}
