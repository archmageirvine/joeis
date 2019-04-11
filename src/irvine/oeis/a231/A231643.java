package irvine.oeis.a231;

import irvine.oeis.LinearRecurrence;

/**
 * A231643 <code>5*2^n + 5</code>.
 * @author Sean A. Irvine
 */
public class A231643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A231643() {
    super(new long[] {-2, 3}, new long[] {10, 15});
  }
}
