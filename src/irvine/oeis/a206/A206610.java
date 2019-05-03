package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206610 Fibonacci sequence beginning <code>13, 8</code>.
 * @author Sean A. Irvine
 */
public class A206610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206610() {
    super(new long[] {1, 1}, new long[] {13, 8});
  }
}
