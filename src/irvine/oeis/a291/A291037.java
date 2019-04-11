package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291037 <code>a(n) =</code> (1/2)*A291036(n).
 * @author Sean A. Irvine
 */
public class A291037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291037() {
    super(new long[] {-1, 0, -2, 2, 2, 2}, new long[] {1, 3, 8, 23, 66, 188});
  }
}
