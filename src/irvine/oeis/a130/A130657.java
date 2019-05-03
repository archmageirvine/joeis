package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130657 Periodic <code>(7 terms) 1 1 1 1 0 0 0</code>.
 * @author Sean A. Irvine
 */
public class A130657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130657() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 0, 0, 0});
  }
}
