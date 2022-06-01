package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279269 a(n) = floor( (4 + sqrt(11))^n ).
 * @author Sean A. Irvine
 */
public class A279269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279269() {
    super(new long[] {5, -13, 9}, new long[] {1, 7, 53});
  }
}
