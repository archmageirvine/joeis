package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024094 <code>8^n-n^6</code>.
 * @author Sean A. Irvine
 */
public class A024094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024094() {
    super(new long[] {-8, 57, -175, 301, -315, 203, -77, 15}, new long[] {1, 7, 0, -217, 0, 17143, 215488, 1979503});
  }
}
