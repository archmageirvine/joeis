package irvine.oeis.a245;
// manually knestm/knest at 2023-03-02 19:24

import irvine.math.z.Z;
import irvine.oeis.a247.A247159;

/**
 * A245685 Sigma(2p)/2, for odd primes p.
 * @author Georg Fischer
 */
public class A245685 extends A247159 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
