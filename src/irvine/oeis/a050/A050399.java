package irvine.oeis.a050;

import irvine.oeis.InverseSequence;
import irvine.oeis.a009.A009195;

/**
 * A050399 Least k such that n = A009195(k) (= gcd(phi(k), k)).
 * @author Sean A. Irvine
 */
public class A050399 extends InverseSequence {

  /** Construct the sequence. */
  public A050399() {
    super(new A009195());
  }
}
