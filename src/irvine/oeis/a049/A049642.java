package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003601;

/**
 * A049642 Numbers k such that the number of divisors of k does not divide the sum of divisors of k.
 * @author Sean A. Irvine
 */
public class A049642 extends ComplementSequence {

  /** Construct the sequence. */
  public A049642() {
    super(new A003601(), Z.TWO);
  }
}
