package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135536 a(n) = 8*a(n-2), with a(0) = 7, a(1) = 14.
 * @author Sean A. Irvine
 */
public class A135536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135536() {
    super(new long[] {8, 0}, new long[] {7, 14});
  }
}
