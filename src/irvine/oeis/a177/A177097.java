package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177097 <code>6*(10^n-5)</code>.
 * @author Sean A. Irvine
 */
public class A177097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177097() {
    super(new long[] {-10, 11}, new long[] {30, 570});
  }
}
