package irvine.oeis.a187;
// manually at 2021-07-04

import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A187442 A trisection of A001405 (central binomial coefficients: binomial(3*n,floor(3*n/2)), n&gt;=0.
 * @author Georg Fischer
 */
public class A187442 extends A001405 {

  /** Construct the sequence. */
  public A187442() {
  }
  
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
