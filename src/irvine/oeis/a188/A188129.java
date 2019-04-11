package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188129 <code>a(n) = (2^n+3)^2-8</code>.
 * @author Sean A. Irvine
 */
public class A188129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188129() {
    super(new long[] {8, -14, 7}, new long[] {8, 17, 41});
  }
}
