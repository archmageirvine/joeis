package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017065 Expansion of <code>1/((1-3x)(1-4x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A017065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017065() {
    super(new long[] {132, -89, 18}, new long[] {1, 18, 235});
  }
}
