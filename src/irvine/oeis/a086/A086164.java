package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a019.A019518;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086164 Binary representation of the concatenation of the first n primes.
 * @author Sean A. Irvine
 */
public class A086164 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086164() {
    super(1, new A019518(), k -> new Z(k.toString(2)));
  }
}
