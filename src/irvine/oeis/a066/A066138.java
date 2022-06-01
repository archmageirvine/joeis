package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066138 a(n) = 10^(2n) + 10^n + 1.
 * @author Sean A. Irvine
 */
public class A066138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066138() {
    super(new long[] {1000, -1110, 111}, new long[] {3, 111, 10101});
  }
}
