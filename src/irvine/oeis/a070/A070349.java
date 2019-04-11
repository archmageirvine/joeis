package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070349 <code>a(n) = 2^n mod 43</code>.
 * @author Sean A. Irvine
 */
public class A070349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070349() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 16, 32, 21, 42});
  }
}
