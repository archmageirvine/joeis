package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074568 a(n) = 4^n + 7^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074568() {
    super(new long[] {224, -116, 19}, new long[] {3, 19, 129});
  }
}
