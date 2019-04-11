package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183010 <code>a(n) = 24*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A183010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183010() {
    super(new long[] {-1, 2}, new long[] {-1, 23});
  }
}
