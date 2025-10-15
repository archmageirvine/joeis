package irvine.oeis.a074;

import irvine.oeis.InverseSequence;
import irvine.oeis.a009.A009194;

/**
 * A074391 a(n) is the smallest number such that gcd(a(n), sigma(a(n))) = n.
 * @author Sean A. Irvine
 */
public class A074391 extends InverseSequence {

  /** Construct the sequence. */
  public A074391() {
    super(1, 1, new A009194());
  }
}
