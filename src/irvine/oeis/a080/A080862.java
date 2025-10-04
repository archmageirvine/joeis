package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a117.A117929;

/**
 * A080862 Numbers which can be expressed as the sum of two distinct primes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A080862 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080862() {
    super(1, new A117929(), Z.SIX::equals);
  }
}

