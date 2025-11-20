package irvine.oeis.a114;

import irvine.oeis.DifferenceSequence;

/**
 * A114139 Changes in United States postal rates per ounce since 1863.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A114139 extends DifferenceSequence {

  /** Construct the sequence. */
  public A114139() {
    super(1, new A114062());
  }
}
