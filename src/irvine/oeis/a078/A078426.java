package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a180.A180221;

/**
 * A078426 Numbers k such that there is no solution to the equation sigma(x) = 2^k, where sigma(x) denotes the sum of the divisors of x.
 * @author Sean A. Irvine
 */
public class A078426 extends ComplementSequence {

  /** Construct the sequence. */
  public A078426() {
    super(1, new A180221(), Z.ONE);
  }
}

