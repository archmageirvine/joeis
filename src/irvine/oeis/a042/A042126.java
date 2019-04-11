package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042126 Numerators of continued fraction convergents to <code>sqrt(588)</code>.
 * @author Sean A. Irvine
 */
public class A042126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042126() {
    super(new long[] {-1, 0, 194, 0}, new long[] {24, 97, 4680, 18817});
  }
}
