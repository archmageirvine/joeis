package irvine.oeis.a077;

import irvine.oeis.InverseSequence;

/**
 * A077102 Smallest number m such that GCD(a+b,a-b) = n, where a = sigma(m) and b = phi(m).
 * @author Sean A. Irvine
 */
public class A077102 extends InverseSequence {

  /** Construct the sequence. */
  public A077102() {
    super(1, new A077099());
  }
}

