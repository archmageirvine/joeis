package irvine.oeis.a187;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A187443 A trisection of A001405 (central binomial coefficients): binomial(3n+1,floor((3n+1)/2)), n&gt;=0.
 * @author Georg Fischer
 */
public class A187443 extends A001405 {

  /** Construct the sequence. */
  public A187443() {
    super.next();
  }

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
