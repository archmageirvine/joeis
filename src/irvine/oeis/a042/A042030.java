package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042030 Numerators of continued fraction convergents to <code>sqrt(539)</code>.
 * @author Sean A. Irvine
 */
public class A042030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042030() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7940, 0, 0, 0, 0, 0, 0, 0}, new long[] {23, 93, 116, 209, 325, 534, 859, 3970, 183479, 737886, 921365, 1659251, 2580616, 4239867, 6820483, 31521799});
  }
}
