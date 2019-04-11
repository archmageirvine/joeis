package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275795 The x members of the positive proper solutions <code>(x = x2(n),</code> y = y2(n)) of the second class for the Pell equation <code>x^2 -</code> 2*y^2 <code>= +7^2</code>.
 * @author Sean A. Irvine
 */
public class A275795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275795() {
    super(new long[] {-1, 6}, new long[] {11, 57});
  }
}
