package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042340 Numerators of continued fraction convergents to <code>sqrt(697)</code>.
 * @author Sean A. Irvine
 */
public class A042340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042340() {
    super(new long[] {1, 0, 0, 264, 0, 0}, new long[] {26, 53, 132, 6917, 13966, 34849});
  }
}
