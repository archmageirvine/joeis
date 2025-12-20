package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a071.A071904;

/**
 * A082686 Odd nonprime integers n which have an odd number of proper divisors.
 * @author Sean A. Irvine
 */
public class A082686 extends FilterSequence {

  /** Construct the sequence. */
  public A082686() {
    super(new A071904(), k -> Functions.SIGMA0.z(k).isEven());
  }
}
