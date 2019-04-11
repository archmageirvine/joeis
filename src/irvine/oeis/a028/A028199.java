package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028199 Expansion of <code>1/((1-5x)(1-10x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028199() {
    super(new long[] {-6600, 3130, -527, 38}, new long[] {1, 38, 917, 17950});
  }
}
