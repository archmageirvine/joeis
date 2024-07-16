package irvine.oeis.a059;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.a005.A005385;

/**
 * A059453 Sophie Germain primes (A005384) that are not safe primes (A005385).
 * @author Sean A. Irvine
 */
public class A059453 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A059453() {
    super(new A005384(), new A005385());
  }
}
