package irvine.oeis.a250;

import irvine.oeis.LinearRecurrence;

/**
 * A250024 <code>40n - 21</code>.
 * @author Sean A. Irvine
 */
public class A250024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A250024() {
    super(new long[] {-1, 2}, new long[] {19, 59});
  }
}
