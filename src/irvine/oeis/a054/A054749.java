package irvine.oeis.a054;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054749 Number of inequivalent connected n-state 1-input n-output automata.
 * @author Sean A. Irvine
 */
public class A054749 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054749() {
    super(1, new A054748());
  }
}
