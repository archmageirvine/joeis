package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113439 <code>a(n) = a(n-1) +</code> Sum_{k=1..floor(n/4)} a(n-4k), with <code>a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A113439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113439() {
    super(new long[] {-1, 2, 0, 0, 1}, new long[] {1, 1, 1, 1, 2});
  }
}
