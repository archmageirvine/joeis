package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132805 A trisection of <code>A024495</code>.
 * @author Sean A. Irvine
 */
public class A132805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132805() {
    super(new long[] {8, 7}, new long[] {0, 3});
  }
}
