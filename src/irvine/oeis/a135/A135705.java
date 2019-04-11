package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135705 <code>a(n) =</code> 10*binomial(n,2) <code>+ 9*n</code>.
 * @author Sean A. Irvine
 */
public class A135705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135705() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 28});
  }
}
