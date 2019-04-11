package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257942 <code>a(n) =</code> (n+1)*(n+2)/A014695(n+1), where A014695 is repeat <code>(1, 2, 2, 1)</code>.
 * @author Sean A. Irvine
 */
public class A257942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257942() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {1, 3, 12, 20, 15, 21, 56, 72, 45});
  }
}
