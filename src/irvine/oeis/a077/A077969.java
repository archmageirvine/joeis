package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a117.A117929;

/**
 * A077969 Numbers which can be expressed as the sum of two distinct primes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A077969 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077969() {
    super(1, new A117929(), Z.THREE::equals);
  }
}

