package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070420 <code>a(n) = 7^n mod 37</code>.
 * @author Sean A. Irvine
 */
public class A070420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070420() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 12, 10, 33, 9, 26, 34, 16});
  }
}
