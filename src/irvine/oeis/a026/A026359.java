package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026359 a(n) = least k such that s(k) = n, where s = A026358.
 * @author Sean A. Irvine
 */
public class A026359 extends InverseSequence {

  /** Construct the sequence. */
  public A026359() {
    super(new A026358());
  }
}
