package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021184 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A021184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021184() {
    super(new long[] {-96, 172, -92, 17}, new long[] {1, 17, 197, 1957});
  }
}
