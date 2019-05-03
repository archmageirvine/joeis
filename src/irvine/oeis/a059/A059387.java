package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059387 Jordan function <code>J_n(6)</code> (see <code>A059379)</code>.
 * @author Sean A. Irvine
 */
public class A059387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059387() {
    super(new long[] {-36, 72, -47, 12}, new long[] {0, 2, 24, 182});
  }
}
