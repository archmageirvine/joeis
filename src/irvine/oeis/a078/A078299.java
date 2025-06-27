package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a117.A117929;

/**
 * A078299 Numbers which can be expressed as the sum of two distinct primes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A078299 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A078299() {
    super(1, new A117929(), Z.FOUR::equals);
  }
}

