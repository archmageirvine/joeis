package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074662 <code>a(n) =</code> F(n+1)+cos(n*Pi/2).
 * @author Sean A. Irvine
 */
public class A074662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074662() {
    super(new long[] {1, 1, 0, 1}, new long[] {2, 1, 1, 3});
  }
}
