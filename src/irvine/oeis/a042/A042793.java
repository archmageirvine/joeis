package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042793 Denominators of continued fraction convergents to <code>sqrt(927)</code>.
 * @author Sean A. Irvine
 */
public class A042793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042793() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 455056, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 9, 47, 150, 797, 3338, 7473, 451718, 910909, 4095354, 21387679, 68258391, 362679634, 1518976927, 3400633488L});
  }
}
