package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135639 a(n) = 839*n.
 * @author Sean A. Irvine
 */
public class A135639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135639() {
    super(new long[] {-1, 2}, new long[] {0, 839});
  }
}
