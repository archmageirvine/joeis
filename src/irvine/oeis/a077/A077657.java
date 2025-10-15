package irvine.oeis.a077;

import irvine.oeis.InverseSequence;

/**
 * A077657 Least number with exactly n consecutive successors, all having the same number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A077657 extends InverseSequence {

  /** Construct the sequence. */
  public A077657() {
    super(0, 0, new A077655());
  }
}
