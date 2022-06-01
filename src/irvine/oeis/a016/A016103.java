package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016103 Expansion of 1/((1-4x)(1-5x)(1-6x)).
 * @author Sean A. Irvine
 */
public class A016103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016103() {
    super(new long[] {120, -74, 15}, new long[] {1, 15, 151});
  }
}
