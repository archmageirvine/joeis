package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020695 Pisot sequence E(2,3).
 * @author Sean A. Irvine
 */
public class A020695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020695() {
    super(new long[] {1, 1}, new long[] {2, 3});
  }
}
