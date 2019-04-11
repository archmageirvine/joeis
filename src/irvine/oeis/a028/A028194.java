package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028194 Expansion of <code>1/((1-5x)(1-8x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028194() {
    super(new long[] {-4800, 2440, -446, 35}, new long[] {1, 35, 779, 14095});
  }
}
