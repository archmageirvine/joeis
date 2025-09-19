package irvine.oeis.a080;

import irvine.oeis.DistinctSequence;

/**
 * A080375 Distinct values of A080374, where A080374(n) is the lcm of the first n consecutive prime differences.
 * @author Sean A. Irvine
 */
public class A080375 extends DistinctSequence {

  /** Construct the sequence. */
  public A080375() {
    super(1, new A080374());
  }
}
