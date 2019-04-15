package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020732 Pisot sequence <code>T(4,7)</code>.
 * @author Sean A. Irvine
 */
public class A020732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020732() {
    super(new long[] {-1, 0, 2}, new long[] {4, 7, 12});
  }
}
