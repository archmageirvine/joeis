package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153173 <code>a(n) = L(5*n)/L(n)</code> where <code>L(n) =</code> Lucas number <code>A000204(n)</code>.
 * @author Sean A. Irvine
 */
public class A153173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153173() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {11, 41, 341, 2161, 15251});
  }
}
