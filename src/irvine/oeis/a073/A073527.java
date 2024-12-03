package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A073527 Numbers n such that denominator of Sum_{k=1..n} 1/k^2 is not a square.
 * @author Sean A. Irvine
 */
public class A073527 extends ComplementSequence {

  /** Construct the sequence. */
  public A073527() {
    super(1, new A073526(), Z.ONE);
  }
}
