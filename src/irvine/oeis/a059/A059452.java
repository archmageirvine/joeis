package irvine.oeis.a059;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.a005.A005385;

/**
 * A059452 Safe primes (A005385) which are not Sophie Germain primes.
 * @author Sean A. Irvine
 */
public class A059452 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A059452() {
    super(new A005385(), new A005384());
  }
}
