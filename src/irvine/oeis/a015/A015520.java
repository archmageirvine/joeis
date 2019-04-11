package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015520 <code>a(n) = 2*a(n-1) + 11*a(n-2), a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A015520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015520() {
    super(new long[] {11, 2}, new long[] {0, 1});
  }
}
