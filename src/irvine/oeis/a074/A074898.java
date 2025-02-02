package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A074898 Impossible values for sum of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A074898 extends ComplementSequence {

  /** Construct the sequence. */
  public A074898() {
    super(1, new A074897(), Z.ONE);
  }
}
