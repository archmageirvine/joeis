package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017952 Expansion of <code>1/((1-3x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A017952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017952() {
    super(new long[] {180, -108, 19}, new long[] {1, 19, 253});
  }
}
