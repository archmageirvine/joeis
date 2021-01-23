package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126109 a(n) = (5*10^n+1)/3.
 * @author Sean A. Irvine
 */
public class A126109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126109() {
    super(new long[] {-10, 11}, new long[] {2, 17});
  }
}
