package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046204 Distinct even numbers in the triangle of denominators in Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046204 extends DistinctSequence {

  /** Construct the sequence. */
  public A046204() {
    super(1, new A046203());
  }
}
