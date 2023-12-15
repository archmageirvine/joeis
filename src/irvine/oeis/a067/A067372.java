package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a084.A084143;

/**
 * A067372 Integers expressible as the sum of (at least two) consecutive primes in at least 2 ways.
 * @author Sean A. Irvine
 */
public class A067372 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067372() {
    super(1, 1, new A084143(), k -> k.compareTo(Z.ONE) > 0);
  }
}
