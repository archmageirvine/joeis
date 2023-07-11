package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;

/**
 * A046201 Distinct odd numbers in the triangle of denominators in Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046201 extends DistinctSequence {

  /** Construct the sequence. */
  public A046201() {
    super(1, new A046200());
  }
}
