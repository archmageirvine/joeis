package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026273 a(n) = least k such that s(k) = n, where s = A026272.
 * @author Sean A. Irvine
 */
public class A026273 extends InverseSequence {

  /** Construct the sequence. */
  public A026273() {
    super(new A026272());
  }
}
