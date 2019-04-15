package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082151 A transform of <code>C(n,2)</code>.
 * @author Sean A. Irvine
 */
public class A082151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082151() {
    super(new long[] {-3375, 5400, -3555, 1232, -237, 24}, new long[] {0, 0, 1, 12, 102, 760});
  }
}
