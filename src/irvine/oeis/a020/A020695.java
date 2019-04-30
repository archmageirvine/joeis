package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020695 Pisot sequence <code>E(2,3)</code>.
 * @author Sean A. Irvine
 */
public class A020695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020695() {
    super(new long[] {1, 1}, new long[] {2, 3});
  }
}
