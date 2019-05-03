package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073314 Binomial transform, alternating in sign, of Lucas generalized numbers <code>S(n): S(n) = S(n-1) + S(n-2) + S(n-3), S(0)=3, S(1)=1, S(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A073314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073314() {
    super(new long[] {-2, 0, 2}, new long[] {3, 2, 4});
  }
}
