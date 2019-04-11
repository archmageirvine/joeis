package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236580 The number of tilings of <code>a 6</code> X <code>(4n) floor</code> with 1 X 4 tetrominoes.
 * @author Sean A. Irvine
 */
public class A236580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236580() {
    super(new long[] {-1, 4, -6, 7}, new long[] {1, 4, 25, 154});
  }
}
