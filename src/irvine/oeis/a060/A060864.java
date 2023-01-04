package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A060864 Positive integers that are not an average of consecutive primes.
 * @author Sean A. Irvine
 */
public class A060864 extends ComplementSequence {

  /** Construct the sequence. */
  public A060864() {
    super(new A060863(), Z.ONE);
  }
}
