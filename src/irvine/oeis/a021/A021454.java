package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021454 Expansion of 1/((1-x)(1-3x)(1-5x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021454() {
    super(new long[] {-135, 222, -104, 18}, new long[] {1, 18, 220, 2310});
  }
}
