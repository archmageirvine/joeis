package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258160 a(n) = 8*Lucas(n).
 * @author Sean A. Irvine
 */
public class A258160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258160() {
    super(new long[] {1, 1}, new long[] {16, 8});
  }
}
