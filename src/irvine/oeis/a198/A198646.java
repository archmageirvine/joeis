package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198646 11*3^n-1.
 * @author Sean A. Irvine
 */
public class A198646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198646() {
    super(new long[] {-3, 4}, new long[] {10, 32});
  }
}
