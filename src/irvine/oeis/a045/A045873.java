package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045873 <code>a(n) = A006496(n)/2</code>.
 * @author Sean A. Irvine
 */
public class A045873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045873() {
    super(new long[] {-5, 2}, new long[] {0, 1});
  }
}
