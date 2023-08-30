package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a054.A054723;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065341 Mersenne composites: 2^prime(m) - 1 is not a prime.
 * @author Sean A. Irvine
 */
public class A065341 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065341() {
    super(1, new A054723(), k -> Z.TWO.pow(k).subtract(1));
  }
}
