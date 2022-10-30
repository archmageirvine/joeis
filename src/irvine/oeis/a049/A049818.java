package irvine.oeis.a049;

import irvine.oeis.PartialSumSequence;

/**
 * A049818 a(n) = Sum_{k=1..n, m=1..n} T(m,k), array T as in A049816.
 * @author Sean A. Irvine
 */
public class A049818 extends PartialSumSequence {

  /** Construct the sequence. */
  public A049818() {
    super(1, new A049817());
  }
}
