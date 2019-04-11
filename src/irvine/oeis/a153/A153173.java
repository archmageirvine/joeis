package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153173 <code>a(n) =</code> L(5*n)/L(n) where L(n) = Lucas number A000204(n).
 * @author Sean A. Irvine
 */
public class A153173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153173() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {11, 41, 341, 2161, 15251});
  }
}
