package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A054023 Chowla function of n is not divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A054023 extends ComplementSequence {

  /** Construct the sequence. */
  public A054023() {
    super(new A054022(), Z.TWO);
  }
}

