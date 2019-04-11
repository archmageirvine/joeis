package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018090 Expansion of <code>1/((1-3x)(1-9x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A018090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018090() {
    super(new long[] {270, -147, 22}, new long[] {1, 22, 337});
  }
}
