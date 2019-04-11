package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024197 <code>a(n) =</code> 3rd elementary symmetric function of the first <code>n+2</code> odd positive integers.
 * @author Sean A. Irvine
 */
public class A024197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024197() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15, 176, 950, 3480, 10045, 24640, 53676});
  }
}
