package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003601;

/**
 * A049642 Number of divisors of n does not divide sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A049642 extends ComplementSequence {

  /** Construct the sequence. */
  public A049642() {
    super(new A003601(), Z.TWO);
  }
}
