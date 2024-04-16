package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a064.A064413;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065203 Total number of primes (without multiplicity) dividing A064413(n).
 * @author Sean A. Irvine
 */
public class A065203 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065203() {
    super(1, new A064413(), k -> Z.valueOf(Functions.OMEGA.i(k)));
  }
}
