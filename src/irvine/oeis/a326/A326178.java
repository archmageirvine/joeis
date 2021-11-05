package irvine.oeis.a326;
// manually deris2/essent at 2021-11-04

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A326178 Number of subsets of {1..n} whose product is equal to their sum.
 * Same as A001477 (the nonnegative integers) with 3 removed.
 * @author Georg Fischer
 */
public class A326178 extends A001477 {

  @Override
  public Z next() {
    Z result = super.next();
    if (result.equals(Z.THREE)) {
      result = super.next();
    }
    return result;
  }
}
