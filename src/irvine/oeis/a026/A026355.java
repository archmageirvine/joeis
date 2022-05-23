package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026355 a(n) = least k such that s(k) = n+1, where s = A026354.
 * @author Sean A. Irvine
 */
public class A026355 extends InverseSequence {

  /** Construct the sequence. */
  public A026355() {
    super(new A026354());
  }
}
