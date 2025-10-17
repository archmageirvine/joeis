package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081237 Numbers n with no k, 0&lt;k&lt;n, such that mu(n-k)=mu(n)=mu(n+k), where mu=A008683 (Moebius function).
 * @author Sean A. Irvine
 */
public class A081237 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081237() {
    super(1, new A081236(), ZERO);
  }
}
