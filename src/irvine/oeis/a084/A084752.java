package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.a064.A064623;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084752 A064623(n)/s, where s = sum of the prime divisors of A064623(n).
 * @author Sean A. Irvine
 */
public class A084752 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084752() {
    super(0, new A064623(), k -> k.divide(Functions.SOPF.z(k)));
  }
}
