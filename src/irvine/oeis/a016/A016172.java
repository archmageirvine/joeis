package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016172 Expansion of 1/((1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A016172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016172() {
    super(new long[] {-54, 15}, new long[] {1, 15});
  }
}
