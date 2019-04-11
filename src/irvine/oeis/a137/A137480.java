package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137480 <code>a(n)=4a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A137480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137480() {
    super(new long[] {4, 0}, new long[] {12, 21});
  }
}
