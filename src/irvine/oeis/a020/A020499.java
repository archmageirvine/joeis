package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020499 Expansion of <code>1/((1-5x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A020499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020499() {
    super(new long[] {495, -199, 25}, new long[] {1, 25, 426});
  }
}
