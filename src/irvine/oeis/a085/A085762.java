package irvine.oeis.a085;

import irvine.oeis.InverseSequence;

/**
 * A085762 Least integer m such that between m and 2m there are n triangular numbers.
 * @author Sean A. Irvine
 */
public class A085762 extends InverseSequence {

  /** Construct the sequence. */
  public A085762() {
    super(1, new A085761());
  }
}
