package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144130 <code>a(n) = ChebyshevT(4, n)</code>.
 * @author Sean A. Irvine
 */
public class A144130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144130() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 97, 577, 1921});
  }
}
