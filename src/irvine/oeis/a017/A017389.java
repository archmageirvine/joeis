package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017389 Expansion of <code>1/((1-3x)(1-5x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A017389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017389() {
    super(new long[] {105, -71, 15}, new long[] {1, 15, 154});
  }
}
