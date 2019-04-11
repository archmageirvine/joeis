package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168614 <code>a(n) = 2^n + 5</code>.
 * @author Sean A. Irvine
 */
public class A168614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168614() {
    super(new long[] {-2, 3}, new long[] {6, 7});
  }
}
