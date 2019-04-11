package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017916 Expansion of <code>1/((1-3x)(1-5x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A017916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017916() {
    super(new long[] {150, -95, 18}, new long[] {1, 18, 229});
  }
}
