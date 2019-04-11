package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022984 <code>28-n</code>.
 * @author Sean A. Irvine
 */
public class A022984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022984() {
    super(new long[] {-1, 2}, new long[] {28, 27});
  }
}
