package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017997 Expansion of <code>1/((1-3x)(1-7x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A017997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017997() {
    super(new long[] {168, -101, 18}, new long[] {1, 18, 223});
  }
}
