package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089772 a(n) = Lucas(11*n).
 * @author Sean A. Irvine
 */
public class A089772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089772() {
    super(new long[] {1, 199}, new long[] {2, 199});
  }
}
