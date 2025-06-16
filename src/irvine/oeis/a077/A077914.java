package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a117.A117929;

/**
 * A077914 Sums of two distinct primes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A077914 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077914() {
    super(1, new A117929(), Z.TWO::equals);
  }
}

