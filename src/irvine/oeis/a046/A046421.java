package irvine.oeis.a046;

import irvine.oeis.InverseSequence;

/**
 * A046421 Index of smallest repunit having exactly n prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046421 extends InverseSequence {

  /** Construct the sequence. */
  public A046421() {
    super(0, new A046053(), 0);
  }
}
