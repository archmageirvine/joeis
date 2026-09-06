package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086488 A086487(n)/S where S is the sum of the prime divisors.
 * @author Sean A. Irvine
 */
public class A086488 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086488() {
    super(1, new A086487(), k -> k.isZero() ? Z.ZERO : k.divide(Functions.SOPF.z(k)));
  }
}

