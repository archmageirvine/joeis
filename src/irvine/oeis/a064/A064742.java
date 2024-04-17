package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064742 Total number of primes (with multiplicity) dividing A064413(n).
 * @author Sean A. Irvine
 */
public class A064742 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064742() {
    super(new A064413(), k -> Functions.BIG_OMEGA.z(k));
  }
}

