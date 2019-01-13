package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177044.
 * @author Sean A. Irvine
 */
public class A177044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177044() {
    super(new long[] {-1, 1, 1}, new long[] {38, 65, 141});
  }
}
