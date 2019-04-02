package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A014092 Numbers that are not the sum of 2 primes.
 * @author Sean A. Irvine
 */
public class A014092 extends ComplementSequence {

  /** Construct the sequence. */
  public A014092() {
    super(new A014091(), Z.ONE);
  }
}
