package irvine.oeis.a065;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000043;
import irvine.oeis.a005.A005384;

/**
 * A065406 Mersenne prime exponents (A000043) which are also Sophie Germain primes (A005384).
 * @author Sean A. Irvine
 */
public class A065406 extends IntersectionSequence {

  /** Construct the sequence. */
  public A065406() {
    super(new A000043(), new A005384());
  }
}
