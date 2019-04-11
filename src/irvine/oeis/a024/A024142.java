package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024142 <code>12^n-n^2</code>.
 * @author Sean A. Irvine
 */
public class A024142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024142() {
    super(new long[] {-12, 37, -39, 15}, new long[] {1, 11, 140, 1719});
  }
}
