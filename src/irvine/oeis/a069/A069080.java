package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069080 <code>a(n) = (2n+1)(2n+2)(2n+6)(2n+7)</code>.
 * @author Sean A. Irvine
 */
public class A069080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069080() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {84, 864, 3300, 8736, 18900});
  }
}
