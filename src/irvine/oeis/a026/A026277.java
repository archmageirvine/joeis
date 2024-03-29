package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026277 a(n) = least k such that s(k) = n, where s = A026276.
 * @author Sean A. Irvine
 */
public class A026277 extends InverseSequence {

  /** Construct the sequence. */
  public A026277() {
    super(new A026276());
  }
}
