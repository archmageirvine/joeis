package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075159 Run lengths in the binary expansion of n-1 gives the vector of exponents in prime factorization of a(n), with the least significant run corresponding to the exponent of the least prime, 2.
 * @author Sean A. Irvine
 */
public class A075159 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075159() {
    super(1, new A075157(), Z.ONE::add);
  }
}
