package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A062729 n not divisible by any prime=p, where either p-2 or p+2 is prime.
 * @author Sean A. Irvine
 */
public class A062729 extends ComplementSequence {

  /** Construct the sequence. */
  public A062729() {
    super(new A062506(), Z.ONE);
  }
}
