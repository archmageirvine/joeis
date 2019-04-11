package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021324 Expansion of <code>1/((1-x)(1-2x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021324() {
    super(new long[] {-240, 404, -188, 25}, new long[] {1, 25, 437, 6629});
  }
}
