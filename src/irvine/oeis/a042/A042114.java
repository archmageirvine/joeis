package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042114 Numerators of continued fraction convergents to <code>sqrt(582)</code>.
 * @author Sean A. Irvine
 */
public class A042114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042114() {
    super(new long[] {-1, 0, 386, 0}, new long[] {24, 193, 9288, 74497});
  }
}
