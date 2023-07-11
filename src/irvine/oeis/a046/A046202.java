package irvine.oeis.a046;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a003.A003506;

/**
 * A046202 Distinct numbers in the triangle of denominators in Leibniz's Harmonic Triangle.
 * @author Sean A. Irvine
 */
public class A046202 extends DistinctSequence {

  /** Construct the sequence. */
  public A046202() {
    super(1, new A003506());
  }
}
