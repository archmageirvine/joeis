package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a063.A063934;

/**
 * A076639 Numbers that are neither primes nor interprimes.
 * @author Sean A. Irvine
 */
public class A076639 extends ComplementSequence {

  /** Construct the sequence. */
  public A076639() {
    super(1, new A063934(), Z.ONE);
  }
}
