package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026363 a(n) = least k such that s(k) = n, where s = A026362.
 * @author Sean A. Irvine
 */
public class A026363 extends InverseSequence {

  /** Construct the sequence. */
  public A026363() {
    super(new A026362());
  }
}
