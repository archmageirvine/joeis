package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053455 a(n) = ((8^n) - (-6)^n)/14.
 * @author Sean A. Irvine
 */
public class A053455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053455() {
    super(new long[] {48, 2}, new long[] {0, 1});
  }
}
