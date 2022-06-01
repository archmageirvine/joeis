package irvine.oeis.a259;
// manually somos4 at 2022-05-31 19:26

import irvine.oeis.recur.GeneralRecurrence;

/**
 * A259419 A Somos-4 like sequence connected with the elliptic curve y^2 + y = x^3 - 3x + 4.
 * @author Georg Fischer
 */
public class A259419 extends GeneralRecurrence {

  /** Construct the sequence */
  public A259419() {
    super(0, 1, 2, 1, -3);
  }

  @Override
  protected void initialize() {
    // a(n) = (a(n-1)*a(n-3) -   a(n-2)^2)/a(n-4) if n is not 2 mod 3, and 
    // a(n) = (a(n-1)*a(n-3) - 3*a(n-2)^2)/a(n-4) if n is 2 mod 3.
    mLambda.add(m -> a(3 * m + 0 - 1).multiply(a(3 * m + 0 - 3)).multiply(1).add(a(3 * m + 0 - 2).square().multiply(-1)).divide(a(3 * m + 0 - 4)));
    mLambda.add(m -> a(3 * m + 1 - 1).multiply(a(3 * m + 1 - 3)).multiply(1).add(a(3 * m + 1 - 2).square().multiply(-1)).divide(a(3 * m + 1 - 4)));
    mLambda.add(m -> a(3 * m + 2 - 1).multiply(a(3 * m + 2 - 3)).multiply(1).add(a(3 * m + 2 - 2).square().multiply(-3)).divide(a(3 * m + 2 - 4)));
  }
}
