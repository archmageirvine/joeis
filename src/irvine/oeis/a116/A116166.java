package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116166 <code>(n^2+n)*8^n</code>.
 * @author Sean A. Irvine
 */
public class A116166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116166() {
    super(new long[] {512, -192, 24}, new long[] {0, 16, 384});
  }
}
