package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070382 <code>a(n) = 5^n mod 34</code>.
 * @author Sean A. Irvine
 */
public class A070382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070382() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 5, 25, 23, 13, 31, 19, 27, 33});
  }
}
