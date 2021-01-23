package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A019470 Numbers n such that n divides binomial(2*n-4, n-2).
 * @author Sean A. Irvine
 */
public class A019470 extends ComplementSequence {

  /** Construct the sequence. */
  public A019470() {
    super(new A019469(), Z.ONE);
  }
}
