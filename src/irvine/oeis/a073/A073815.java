package irvine.oeis.a073;

import irvine.oeis.InverseSequence;
import irvine.oeis.a009.A009223;

/**
 * A073815 Least number x such that gcd(phi(x), sigma(x)) = n.
 * @author Sean A. Irvine
 */
public class A073815 extends InverseSequence {

  /** Construct the sequence. */
  public A073815() {
    super(1, new A009223());
  }
}
