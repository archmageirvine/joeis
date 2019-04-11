package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097040 <code>a(n) =</code> 2*sum(C(n,2k+1)*F(2k), <code>k=0..floor((n-1)/2)),</code> where F(n) are Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A097040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097040() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 2, 8});
  }
}
