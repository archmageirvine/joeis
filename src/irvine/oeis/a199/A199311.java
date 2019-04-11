package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199311 <code>8*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199311() {
    super(new long[] {-5, 6}, new long[] {9, 41});
  }
}
