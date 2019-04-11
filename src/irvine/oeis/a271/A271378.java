package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271378 <code>a(n) = 5^n mod 31</code>.
 * @author Sean A. Irvine
 */
public class A271378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271378() {
    super(new long[] {1, 0, 0}, new long[] {1, 5, 25});
  }
}
