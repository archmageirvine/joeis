package irvine.oeis.a007;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001599;
import irvine.oeis.a003.A003601;

/**
 * A007340 Numbers n such that both the harmonic and arithmetic means of the divisors of n are integers.
 * @author Sean A. Irvine
 */
public class A007340 extends IntersectionSequence {

  /** Construct the sequence. */
  public A007340() {
    super(new A001599(), new A003601());
  }
}
