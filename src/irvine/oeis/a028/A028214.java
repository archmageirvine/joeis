package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028214 Expansion of <code>1/((1-6x)(1-8x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028214() {
    super(new long[] {-5760, 2736, -476, 36}, new long[] {1, 36, 820, 15120});
  }
}
