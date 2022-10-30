package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049845 a(n) = Sum_{m=2..n, k=1..m-1} T(m,k), array T as in A049843.
 * @author Sean A. Irvine
 */
public class A049845 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049845() {
    super(2, new A049844());
  }
}
