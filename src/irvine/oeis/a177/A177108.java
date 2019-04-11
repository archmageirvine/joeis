package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177108 <code>a(n) = 4*(10^n-3)</code>.
 * @author Sean A. Irvine
 */
public class A177108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177108() {
    super(new long[] {-10, 11}, new long[] {28, 388});
  }
}
