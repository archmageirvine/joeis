package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016147 Expansion of 1/((1-3x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016147() {
    super(new long[] {-36, 15}, new long[] {1, 15});
  }
}
