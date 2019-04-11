package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130793 Periodic sequence with period 3: <code>1, 3, 5</code>.
 * @author Sean A. Irvine
 */
public class A130793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130793() {
    super(new long[] {1, 0, 0}, new long[] {1, 3, 5});
  }
}
