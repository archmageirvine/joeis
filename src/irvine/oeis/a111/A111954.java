package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111954 <code>a(n) =</code> A000129(n) <code>+ (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A111954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111954() {
    super(new long[] {1, 3, 1}, new long[] {1, 0, 3});
  }
}
