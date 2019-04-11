package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198442 Number of sequences of n coin flips that win on the last flip, if the sequence of flips ends with <code>(1,1,0)</code> or <code>(1,0,0)</code>.
 * @author Sean A. Irvine
 */
public class A198442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198442() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 0, 2, 3});
  }
}
