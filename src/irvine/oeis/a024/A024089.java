package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024089 <code>8^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024089() {
    super(new long[] {8, -17, 10}, new long[] {1, 7, 62});
  }
}
