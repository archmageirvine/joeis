package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060645 <code>a(0) = 0, a(1) = 4</code>, then <code>a(n) = 18*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A060645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060645() {
    super(new long[] {-1, 18}, new long[] {0, 4});
  }
}
