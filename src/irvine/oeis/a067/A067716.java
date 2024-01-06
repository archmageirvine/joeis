package irvine.oeis.a067;

import irvine.oeis.InverseSequence;

/**
 * A067716 The least number k whose standard deviation of its prime factors (rounded up if necessary), with each factor counted according to its frequency of occurrence in the prime factorization of k (A067631) is n.
 * @author Sean A. Irvine
 */
public class A067716 extends InverseSequence {

  /** Construct the sequence. */
  public A067716() {
    super(0, new A067631(), 0);
  }
}
