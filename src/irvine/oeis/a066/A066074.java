package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066074 Primes arising in A066073.
 * @author Sean A. Irvine
 */
public class A066074 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066074() {
    super(1, new A066073(), k -> Functions.SIGMA.z(k).subtract(1));
  }
}
