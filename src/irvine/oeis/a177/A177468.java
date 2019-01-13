package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177468.
 * @author Sean A. Irvine
 */
public class A177468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177468() {
    super(new long[] {22, -31, -69, 30, 5}, new long[] {1, 6, 72, 463, 4030});
  }
}
