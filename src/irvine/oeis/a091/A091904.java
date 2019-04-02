package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091904 Expansion of x/((1+4x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A091904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091904() {
    super(new long[] {32, 4}, new long[] {0, 1});
  }
}
