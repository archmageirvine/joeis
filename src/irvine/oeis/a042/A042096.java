package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042096 Numerators of continued fraction convergents to sqrt(572).
 * @author Sean A. Irvine
 */
public class A042096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042096() {
    super(new long[] {-1, 0, 0, 0, 574, 0, 0, 0}, new long[] {23, 24, 263, 287, 13465, 13752, 150985, 164737});
  }
}
