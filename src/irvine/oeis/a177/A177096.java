package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177096 <code>5*(10^n-2)</code>.
 * @author Sean A. Irvine
 */
public class A177096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177096() {
    super(new long[] {-10, 11}, new long[] {40, 490});
  }
}
