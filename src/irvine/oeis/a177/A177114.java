package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177114 <code>4*(10^n-9)</code>.
 * @author Sean A. Irvine
 */
public class A177114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177114() {
    super(new long[] {-10, 11}, new long[] {4, 364});
  }
}
