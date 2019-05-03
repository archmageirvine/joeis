package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176448 <code>7*2^n-2</code>.
 * @author Sean A. Irvine
 */
public class A176448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176448() {
    super(new long[] {-2, 3}, new long[] {5, 12});
  }
}
