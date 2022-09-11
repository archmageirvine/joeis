package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059056 Penrice Christmas gift numbers, Card-matching numbers (Dinner-Diner matching numbers): Triangle T(n,k) = number of ways to get k matches for a deck with n cards, 2 of each kind.
 * @author Sean A. Irvine
 */
public class A059056 extends A059057 {

  @Override
  public Z next() {
    return super.next().shiftRight(mN);
  }
}
