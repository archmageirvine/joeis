package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042274 Numerators of continued fraction convergents to <code>sqrt(663)</code>.
 * @author Sean A. Irvine
 */
public class A042274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042274() {
    super(new long[] {-1, 0, 0, 0, 206, 0, 0, 0}, new long[] {25, 26, 77, 103, 5227, 5330, 15887, 21217});
  }
}
