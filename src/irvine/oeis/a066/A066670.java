package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066670 Primes arising in A066669: the only odd prime divisor of phi(A066669(n)).
 * @author Sean A. Irvine
 */
public class A066670 extends FilterSequence {

  /** Construct the sequence. */
  public A066670() {
    super(1, new SimpleTransformSequence(new A000010(), Z::makeOdd), PRIME);
  }
}
