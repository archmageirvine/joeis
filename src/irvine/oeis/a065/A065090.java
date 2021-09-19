package irvine.oeis.a065;
// manually 2021-09-17

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A065090 Natural numbers which are not odd primes: composites plus 1 and 2. 
 * @author Georg Fischer
 */
public class A065090 extends ComplementSequence {

  /** Construct the sequence. */
  public A065090() {
    super(new A065091(), Z.ONE);
  }
}
