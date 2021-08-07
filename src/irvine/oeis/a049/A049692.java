package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A049692 Numbers k such that the square of the number of divisors of k does not divide the sum of the divisors of k.
 * @author Sean A. Irvine
 */
public class A049692 extends ComplementSequence {

  /** Construct the sequence. */
  public A049692() {
    super(new A049645(), Z.ONE);
  }
}
