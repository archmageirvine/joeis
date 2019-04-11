package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079859 <code>a(n) = n*2^(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A079859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079859() {
    super(new long[] {-4, 4}, new long[] {4, 10});
  }
}
