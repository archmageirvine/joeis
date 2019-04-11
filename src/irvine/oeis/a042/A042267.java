package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042267 Denominators of continued fraction convergents to <code>sqrt(659)</code>.
 * @author Sean A. Irvine
 */
public class A042267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042267() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 11860, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 76, 155, 231, 11705, 11936, 35577, 901361, 1838299, 2739660});
  }
}
