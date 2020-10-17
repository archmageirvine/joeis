package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.a322.A322469;

/**
 * A307048 Permutation of the positive integers derived from the terms of A322469 having the form 6*k - 2.
 *
 * @author Georg Fischer
 */
public class A307048 extends A322469 {

  /**
   * Construct the sequence.
   */
  public A307048() {
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (!result.mod(Z.SIX).equals(Z.FOUR)) {
      result = super.next();
    }
    return result.add(Z.TWO).divide(Z.SIX);
  }
}
