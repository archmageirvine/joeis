package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243470 Numerators of the rational convergents to the periodic continued fraction <code>1/(2 + 1/(7 + 1/(2 + 1/(7 + </code>...)))).
 * @author Sean A. Irvine
 */
public class A243470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243470() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 7, 15, 112});
  }
}
