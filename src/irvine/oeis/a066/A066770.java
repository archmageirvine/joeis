package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066770 a(n) = 5^n*sin(2n*arctan(1/2)) or numerator of tan(2n*arctan(1/2)).
 * @author Sean A. Irvine
 */
public class A066770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066770() {
    super(new long[] {-25, 6}, new long[] {4, 24});
  }
}
