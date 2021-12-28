package irvine.oeis.a053;

import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050975;

/**
 * A053446 Multiplicative order of 3 mod m, where gcd(m, 3) = 1.
 * @author Sean A. Irvine
 */
public class A053446 extends PrependSequence {

  /** Construct the sequence. */
  public A053446() {
    super(new A050975(), 1);
  }
}

