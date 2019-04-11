package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023000 <code>a(n) = (7^n - 1)/6</code>.
 * @author Sean A. Irvine
 */
public class A023000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023000() {
    super(new long[] {-7, 8}, new long[] {0, 1});
  }
}
