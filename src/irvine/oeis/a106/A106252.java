package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106252 Number of positive integer triples <code>(x,y,z),</code> with <code>x&lt;=y&lt;=z&lt;=n,</code> such that each of <code>x,y</code> and z divides the sum of the other two.
 * @author Sean A. Irvine
 */
public class A106252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106252() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 3, 5, 7, 8});
  }
}
