package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021274 Expansion of <code>1/((1-x)(1-2x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021274() {
    super(new long[] {-176, 302, -147, 22}, new long[] {1, 22, 337, 4482});
  }
}
