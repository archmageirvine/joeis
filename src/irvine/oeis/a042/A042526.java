package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042526 Numerators of continued fraction convergents to <code>sqrt(792)</code>.
 * @author Sean A. Irvine
 */
public class A042526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042526() {
    super(new long[] {-1, 0, 394, 0}, new long[] {28, 197, 11060, 77617});
  }
}
