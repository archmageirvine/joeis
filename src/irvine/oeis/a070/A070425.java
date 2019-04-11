package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070425 <code>a(n) = 7^n mod 43</code>.
 * @author Sean A. Irvine
 */
public class A070425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070425() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 7, 6, 42});
  }
}
