package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021064 Expansion of <code>1/((1-x)(1-2x)(1-3x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021064() {
    super(new long[] {-72, 138, -83, 18}, new long[] {1, 18, 241, 2982});
  }
}
