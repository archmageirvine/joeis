package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066104 <code>a(2n) = 2n, a(2n+1) = 4(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A066104 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066104() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 4, 2, 8});
  }
}
