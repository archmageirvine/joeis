package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226370 Number of tilings of <code>a 6</code> X n rectangle using integer sided square tiles of area <code>&gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A226370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226370() {
    super(new long[] {1, 0, 2, 1, 1, 0}, new long[] {1, 0, 1, 1, 3, 2});
  }
}
