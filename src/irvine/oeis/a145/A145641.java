package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145641 Numbers whose binary representation is the concatenation of <code>n 1's, n 0</code>'s and <code>n 1</code>'s.
 * @author Sean A. Irvine
 */
public class A145641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145641() {
    super(new long[] {-64, 120, -70, 15}, new long[] {5, 51, 455, 3855});
  }
}
