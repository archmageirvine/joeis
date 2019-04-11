package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146005 <code>a(n) =</code> n*Lucas(n).
 * @author Sean A. Irvine
 */
public class A146005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146005() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 1, 6, 12});
  }
}
