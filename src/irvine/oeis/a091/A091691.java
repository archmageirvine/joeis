package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091691 <code>(10^(n-1)-1) * (n-10) / 9</code>.
 * @author Sean A. Irvine
 */
public class A091691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091691() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 0, -8, -77});
  }
}
