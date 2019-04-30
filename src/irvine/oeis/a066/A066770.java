package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066770 <code>5^n sin(2n arctan(1/2))</code> or numerator of <code>tan(2n arctan(1/2))</code>.
 * @author Sean A. Irvine
 */
public class A066770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066770() {
    super(new long[] {-25, 6}, new long[] {4, 24});
  }
}
