package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168520 <code>a(n) = 98*a(n-1) - a(n-2); a(1) = 0, a(2) = 10</code>.
 * @author Sean A. Irvine
 */
public class A168520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168520() {
    super(new long[] {-1, 98}, new long[] {0, 10});
  }
}
