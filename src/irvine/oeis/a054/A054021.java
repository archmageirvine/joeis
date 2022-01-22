package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A054021 Numbers n such that Chowla's function of n is divisible by the number of proper divisors of n.
 * @author Sean A. Irvine
 */
public class A054021 extends ComplementSequence {

  /** Construct the sequence. */
  public A054021() {
    super(new A054020(), Z.TWO);
  }
}

