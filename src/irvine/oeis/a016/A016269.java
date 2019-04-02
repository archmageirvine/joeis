package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016269 Number of monotone Boolean functions of n variables with 2 mincuts. Also number of Sperner systems with 2 blocks.
 * @author Sean A. Irvine
 */
public class A016269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016269() {
    super(new long[] {24, -26, 9}, new long[] {1, 9, 55});
  }
}
