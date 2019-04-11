package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107659 <code>a(n) =</code> Sum_{k=0..n} 2^max(k, <code>n-k)</code>.
 * @author Sean A. Irvine
 */
public class A107659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107659() {
    super(new long[] {-4, 2, 2}, new long[] {1, 4, 10});
  }
}
