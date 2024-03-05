package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024912;

/**
 * A068673 Numbers which yield primes when a 1 is prefixed or appended.
 * @author Sean A. Irvine
 */
public class A068673 extends FilterSequence {

  /** Construct the sequence. */
  public A068673() {
    super(1, new A024912(), k -> new Z("1" + k).isProbablePrime());
  }
}
