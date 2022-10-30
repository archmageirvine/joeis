package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049836 a(n) = Sum_{m=1..n, k=1..m} T(m,k), array T as in A049834.
 * @author Sean A. Irvine
 */
public class A049836 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049836() {
    super(1, new A049835());
  }
}
