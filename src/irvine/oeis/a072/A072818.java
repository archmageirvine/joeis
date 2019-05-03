package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072818 Possibly the only integers of the form <code>sqrt(m^2*(m^2-1)*2/3) [only</code> checked for the first <code>5 terms]</code>.
 * @author Sean A. Irvine
 */
public class A072818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072818() {
    super(new long[] {-1, 98}, new long[] {0, 20});
  }
}
