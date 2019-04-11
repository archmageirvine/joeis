package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280154 <code>a(n) =</code> 5*Lucas(n).
 * @author Sean A. Irvine
 */
public class A280154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280154() {
    super(new long[] {1, 1}, new long[] {10, 5});
  }
}
