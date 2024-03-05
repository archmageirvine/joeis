package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a102.A102338;

/**
 * A068674 Numbers which yield primes when a 3 is prefixed or appended.
 * @author Sean A. Irvine
 */
public class A068674 extends FilterSequence {

  /** Construct the sequence. */
  public A068674() {
    super(1, new A102338(), k -> new Z("3" + k).isProbablePrime());
  }
}
