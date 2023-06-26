package irvine.oeis.a049;

import irvine.oeis.FiniteSequence;

/**
 * A049011 Composite numbers k such that number of composite d with 3 &lt; d &lt; k, gcd(k, d) = 1, is pi(k).
 * @author Sean A. Irvine
 */
public class A049011 extends FiniteSequence {

  /** Construct the sequence. */
  public A049011() {
    super(1, FINITE, 27, 286, 370, 520, 550, 1332, 13530, 38220);
  }
}
