package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060868 Number of n X n matrices over GF(3) with rank 1.
 * @author Sean A. Irvine
 */
public class A060868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060868() {
    super(new long[] {27, -39, 13}, new long[] {2, 32, 338});
  }
}
