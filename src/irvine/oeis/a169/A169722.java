package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169722 <code>a(n) = (3*2^(n-1)-1)*(18*2^(n-1)-7)</code>.
 * @author Sean A. Irvine
 */
public class A169722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169722() {
    super(new long[] {8, -14, 7}, new long[] {1, 22, 145});
  }
}
