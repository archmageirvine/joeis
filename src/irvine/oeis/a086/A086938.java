package irvine.oeis.a086;

import irvine.oeis.InverseSequence;

/**
 * A086938 Smallest m with A086571(m) = n.
 * @author Sean A. Irvine
 */
public class A086938 extends InverseSequence {

  /** Construct the sequence. */
  public A086938() {
    super(1, new A086571());
  }
}


