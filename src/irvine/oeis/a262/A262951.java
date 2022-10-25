package irvine.oeis.a262;
// manually adiveo at 2022-05-30 20:25

import irvine.math.z.Z;
import irvine.oeis.a068.A068915;

/**
 * A262951 a(1) = 1, a(2) = 3, a(3) = 4 and for n&gt;=4, a(n) = (a(n-3)+a(n-2)+a(n-1)+k) mod 10 where k = a(n/6) if n is divisible by 6, else 0.
 * @author Georg Fischer
 */
public class A262951 extends A068915 {

  /** Construct the sequence */
  public A262951() {
    super(1, 0, 1, 3, 4);
    setOffset(1);
  }

  @Override
  protected void initialize() {
    mFuncF = n -> a(n - 3).add(a(n - 2)).add(a(n - 1)).add(((n % 6 == 0) && (n > 6)) ? a(n / 6) : Z.ZERO).mod(Z.TEN);
    mFuncT = n -> a(n / 2);
  }
}
