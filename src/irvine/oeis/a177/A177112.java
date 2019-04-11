package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177112 <code>4*(10^n-7)</code>.
 * @author Sean A. Irvine
 */
public class A177112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177112() {
    super(new long[] {-10, 11}, new long[] {12, 372});
  }
}
