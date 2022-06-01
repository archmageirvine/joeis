package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137480 a(n)=4a(n-2).
 * @author Sean A. Irvine
 */
public class A137480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137480() {
    super(new long[] {4, 0}, new long[] {12, 21});
  }
}
