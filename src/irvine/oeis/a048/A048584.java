package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048584 Pisot sequence <code>L(5,7)</code>.
 * @author Sean A. Irvine
 */
public class A048584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048584() {
    super(new long[] {-1, 0, 2}, new long[] {5, 7, 10});
  }
}
