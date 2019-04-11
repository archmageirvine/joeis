package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028206 Expansion of <code>1/((1-6x)(1-7x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028206() {
    super(new long[] {-4536, 2286, -423, 34}, new long[] {1, 34, 733, 12826});
  }
}
