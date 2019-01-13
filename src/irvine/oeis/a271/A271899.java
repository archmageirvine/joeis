package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271899.
 * @author Sean A. Irvine
 */
public class A271899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271899() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 18, 162, 927, 3906, 13248, 38256, 97614, 225819});
  }
}
