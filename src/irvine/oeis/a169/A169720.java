package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169720 <code>a(n) = (3*2^(n-1)-1)*(3*2^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A169720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169720() {
    super(new long[] {8, -14, 7}, new long[] {1, 10, 55});
  }
}
